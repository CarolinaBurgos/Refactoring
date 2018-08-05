/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correcto;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    /**
     * @uml.property name="_name"
     */
    private String _name;
    /**
     * @uml.property name="_rentals"
     * @uml.associationEnd multiplicity="(0 -1)" elementType="Rental"
     */
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        rental(frequentRenterPoints, result, rentals, totalAmount);
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
    
    public void rental(int frequentRenterPoints, String result, Enumeration rentals, double totalAmount) {
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = amountFor(each);
            frequentRenterPoints = frequentRenter(frequentRenterPoints, each);            
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
    }
    
    public int frequentRenter(int frequentRenterPoints, Rental each) {
        if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
            frequentRenterPoints += 2;
        } else {
            frequentRenterPoints++;
        }        
        return frequentRenterPoints;
    }

    private double amountFor(Rental aRental) {
        return getCharge(aRental);
    }

    public double getCharge(Rental aRental) {
        double result = 0;
        switch (aRental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result = getChargeRegular(aRental, result);
                break;
            case Movie.NEW_RELEASE:
                result += aRental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result = getChargeChildrens(aRental, result);
                break;
        }
        return result;
    }
    
    public double getChargeRegular(Rental aRental, double result) {
        result += 2;
        if (aRental.getDaysRented() > 2) {
            result += (aRental.getDaysRented() - 2) * 1.5;
        }
        return result;
    }
    
    public double getChargeChildrens(Rental aRental, double result) {
        result += 1.5;
        if (aRental.getDaysRented() > 3) {
            result += (aRental.getDaysRented() - 3) * 1.5;
        }
        return result;
    }    
}
