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
    private final ArrayList<MovieTicketOrder> cart;
    
    public ShoppingCart()
    {
        cart = new ArrayList<>();
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

