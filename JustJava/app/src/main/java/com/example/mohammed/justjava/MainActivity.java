package com.example.mohammed.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    //this is global variable and will update according + or - button
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     * will update according the number of coffees here coffee price is 5 euro
     */
    public void submitOrder(View view) {
        /*display(quantity);
        displayPrice(quantity * 5);*/
        int price = quantity * 5;
        String priceMessage = "Total : $" + price + "\nThank you!";
        //priceMessage = priceMessage+ "\nThank you!"
        displayMessage(priceMessage);

    }

    /**
     * This method is called when the + button is clicked.
     * and will increase 1 at a time
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the - button is clicked.
     * and will decrease 1 at a time
     */

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method display the given quantity price value on the screen
     * @param number
     */
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /***
     * This methos display the given text on the screen
     * @param message
     */
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}