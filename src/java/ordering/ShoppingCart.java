/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import java.util.ArrayList;

/**
 *
 * @author Roderick Burkhardt
 */
public class ShoppingCart
{
    private ArrayList<MovieTicketOrder> cart;
    private Double cartSubtotal;
    private Double cartTax;
    private Double cartTotal;
    
    public ShoppingCart()
    {
        cart = new ArrayList<>();
    }

    public Double getCartSubtotal()
    {
        return cartSubtotal;
    }
    
    public boolean setCartSubtotal(Double cartSubtotal)
    {
        this.cartSubtotal = cartSubtotal;
        return true;
    }

    public Double getCartTax()
    {
        return cartTax;
    }
    
    public boolean setCartTax(Double cartTax)
    {
        this.cartTax = cartTax;
        return true;
    }

    public Double getCartTotal()
    {
        return cartTotal;
    }
    
    public boolean setCartTotal(Double cartTotal)
    {
        this.cartTotal = cartTotal;
        return true;
    }
    
    public boolean addMovieToCart( MovieTicketOrder movieTicketOrder )
    {
        cart.add( movieTicketOrder );
        return true;
    }
    
    public boolean removeMovieFromCart(Integer index)
    {
        try
        {
            System.out.println(cart.remove(index.intValue()));
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }
    
    public boolean emptyCart()
    {
        for ( int i = 0; i < cart.size(); i++ )
            cart.remove(i);
        
        return cart.isEmpty();
    }

    @Override
    public String toString()
    {
        String rtrnString;
        
        if ( !cart.isEmpty() )
        {
            rtrnString = "Shopping Cart contains:\n";
            for (MovieTicketOrder item : cart )
            {
                rtrnString += item.toString() + "\n";
            }
        }
        else
        {
            rtrnString = "Shopping Cart is Empty";
        }
        
        return rtrnString;
    }
    
    
    
}

