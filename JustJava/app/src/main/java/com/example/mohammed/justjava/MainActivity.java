        package com.example.mohammed.justjava;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
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
                //int price = quantity * 5;
                //String priceMessage = "Total : $" + price + "\nThank you!";
                //priceMessage = priceMessage+ "\nThank you!"

                /**
                 * Here i will use whether checkBox is selected or not
                 */
                //for hipped cream
                CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whippedCream_checkBox);
                //isChecked is a method and its return boolean result
                boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

                //fro chocolate
                CheckBox ChocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkBox);
                //isChecked is a method and its return boolean result
                boolean hasChocolate = ChocolateCheckBox.isChecked();
               //to see the result use the log here
                //Log.v("MainActivity", "has whillped cream : " +hasWhippedCraem );

                //to get the input text

                EditText nameInput = (EditText) findViewById(R.id.input_name);
                String name = nameInput.getText().toString();
                //log message to check its working or not
                //Log.v("MainActivity","Name: "+name);

                //to calculate the price based on the topping
                //to get the coffee price
                int price = calculatePrice(hasWhippedCream, hasChocolate);
               // String priceMessage = "Total : $" + price + "\nThank you!";

                String result = createOrderSummary(name, price, hasWhippedCream,hasChocolate);
                displayMessage(result);


                //displayMessage(priceMessage);
                //calculatePrice();
            }

            /**
             * Calculate the price based on the quantity
             * @param quantity
             * @return
             */
            /*public void calculatePrice(int quantity){
                int price = quantity * 5;
                //return price;
            }*/

            /*public void calculatePrice(int quantity, int pricePerCup){
                int price = quantity * pricePerCup;
                //return price;
            }*/

            /**
             * Calculates the price of the order based on the topping
             * @param addWhippedCream is whether or not user wants whipped cream o not
             * @param addChocolate is whether or not user wants chocolate or not
             * @return total price
             */
            private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
                int baseCoffeePrice = 5; //price of the coffee per cup

                //if user select adding whipped cream it will add 1 dolor
                if (addWhippedCream){
                    baseCoffeePrice = baseCoffeePrice + 1;
                }
                //if user select adding chocolate it will add 2 dolor
                if (addChocolate){
                   baseCoffeePrice =  baseCoffeePrice + 2;
                }

                return quantity * baseCoffeePrice;
            }

            /**
             * This method will display order summery

             * @param inputName person name
             * @param coffeePrice coffe price per cup
             * @param addWhippedCream is whether or not useer wants whipped cream or not
             * @param addChocolate is whether chocolate added or not
             * @return order summery
             */
            private String createOrderSummary(String inputName, int coffeePrice, boolean addWhippedCream, boolean addChocolate){
                String result = "Name :" +inputName+
                                "\nAdd Whipped Cream :" +addWhippedCream+
                                "\nAdd Chocolate :" +addChocolate+
                                "\nQuantity :" + quantity +
                                "\nTotal $ :" +coffeePrice +
                                "\nThank you!";
                return result;

                // another way to do this like
                //String priceMessage = "Name : Mohammed";
                //priceMessage = priceMessage + "Quantity :" + quantity;
                //priceMessage = priceMessage + "Total: $" + coffeePrice;
                //priceMessage = priceMessage + "\nThank you!";
                //return priceMessage;
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
             *
             * @param number
             */
           /* private void displayPrice(int number) {
                TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
                priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
            }*/

            /***
             * This methos display the given text on the screen
             * @param message
             */
            private void displayMessage(String message) {
                TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
                orderSummaryTextView.setText(message);
            }



        }