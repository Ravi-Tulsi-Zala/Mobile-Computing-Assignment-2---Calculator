package zala.ravi.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {




    private TextView input;
    private TextView output;
    private String error;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button decimal;
    private Button multiply;
    private Button divide;
    private Button add;
    private Button subtract;
    private Button clear;
    private Button sign;
    private Button result;
    private Button mem_clear;
    private Button mem_recall;
    private Button mem_add;
    private Button mem_sub;
    private Toolbar toolbar;


    private String OPERATION;

    //Dot_Flag for implementing Decimal Functionality and Result flag for satisfying condition when e.g '2+=' presssed it will show 2+ only.
    boolean dot_flag=true,result_flag = true;
    //Val variable for toggle button of +/-
    double operand1 = Double.NaN, operand2,val,memory;
    //str1 varible for common string operations and taking values from textview
    String str1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setUpIds();             //Mapping of xml components to java
        setUpOnClickListeners();
    }



    private void setUpIds()
    {
        input = (TextView) findViewById(R.id.tv_input);
        output = (TextView) findViewById(R.id.tv_output);

        one = (Button) findViewById(R.id.btn_One);
        two = (Button) findViewById(R.id.btn_Two);
        three = (Button) findViewById(R.id.btn_Three);
        four = (Button) findViewById(R.id.btn_Four);
        five = (Button) findViewById(R.id.btn_Five);
        six = (Button) findViewById(R.id.btn_Six);
        seven = (Button) findViewById(R.id.btn_Seven);
        eight = (Button) findViewById(R.id.btn_Eight);
        nine = (Button) findViewById(R.id.btn_Nine);
        zero = (Button) findViewById(R.id.btn_Zero);
        decimal = (Button) findViewById(R.id.btn_Decimal);
        clear = (Button) findViewById(R.id.btn_Clear);
        add = (Button) findViewById(R.id.btn_Addition);
        multiply = (Button) findViewById(R.id.btn_Multiplication);
        subtract = (Button) findViewById(R.id.btn_Minus);
        divide = (Button) findViewById(R.id.btn_Division);
        result = (Button) findViewById(R.id.btn_EqualTo);
        mem_clear = (Button) findViewById(R.id.btn_MC);
        mem_sub = (Button) findViewById(R.id.btn_MMinus);
        mem_add = (Button) findViewById(R.id.btn_MPlus);
        mem_recall = (Button) findViewById(R.id.btn_MR);
        sign = (Button) findViewById(R.id.btn_PlusOrMinus);

    }

    private void setUpOnClickListeners()
    {
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //By Default textview text is zero , it won't allow the numbers like 01,011 etc

                String str1 = input.getText().toString();

                if(!str1.equals("0") )
                {
                    input.setText(str1 + "1");
                }
                else
                {
                    input.setText("1");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //By Default textview text is zero , it won't allow the numbers like 02,022 etc
                String str1 = input.getText().toString();
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "2");
                }
                else
                {
                    input.setText("2");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String str1 = input.getText().toString();
                //By Default textview text is zero , it won't allow the numbers like 03,033 etc
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "3");
                }
                else
                {
                    input.setText("3");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String str1 = input.getText().toString();
                //By Default textview text is zero , it won't allow the numbers like 04,044 etc
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "4");
                }
                else
                {
                    input.setText("4");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String str1 = input.getText().toString();
                //By Default textview text is zero , it won't allow the numbers like 05,055 etc
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "5");
                }
                else
                {
                    input.setText("5");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String str1 = input.getText().toString();
                //By Default textview text is zero , it won't allow the numbers like 06,066 etc
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "6");
                }
                else
                {
                    input.setText("6");
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //By Default textview text is zero , it won't allow the numbers like 07,077 etc
                String str1 = input.getText().toString();

                if(!str1.equals("0"))
                {
                    input.setText(str1 + "7");
                }
                else
                {
                    input.setText("7");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String str1 = input.getText().toString();
                //By Default textview text is zero , it won't allow the numbers like 08,088 etc
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "8");
                }
                else
                {
                    input.setText("8");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String str1 = input.getText().toString();
                //By Default textview text is zero , it won't allow the numbers like 09,099 etc
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "9");
                }
                else
                {
                    input.setText("9");
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //By Default textview text is zero , it won't allow the numbers like 00,000 etc
                String str1 = input.getText().toString();
                if(!str1.equals("0"))
                {
                    input.setText(str1 + "0");
                }
                else
                {
                    input.setText("0");
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Clearing the operand values and textViews text
                // setting the decimal and results flags to true for allowing only one dot and "2+=" -> "2+" funntionality respectively
                input.setText("0");
                output.setText(null);
                operand1 = Double.NaN;
                operand2 = Double.NaN;
                result_flag = true;
                dot_flag= true;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    dot_flag = true;
                    //Calculate() function call for functionality 2+2 should give 4 before any other operation.
                    //Calculate() also prevent the user errors like 2+++2, 2+*-/2 etc
                    calculate();
                    OPERATION = "add";
                    output.setText(String.valueOf(operand1 + "+"));
                    input.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    dot_flag = true;
                    //Calculate() function call for functionality 2-2 should give 0 before any other operation.
                    //Calculate() also prevent the user errors like 2---2, 2-+*/+-*2 etc
                    calculate();
                    OPERATION = "sub";
                    output.setText(String.valueOf(operand1 + "-"));
                    input.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    dot_flag = true;
                    //Calculate() function call for functionality 2*2 should give 4 before any other operation.
                    //Calculate() also prevent the user errors like 2***2, 2*+-/2 etc
                    calculate();
                    OPERATION = "mul";
                    output.setText(String.valueOf(operand1 + "×"));
                    input.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    dot_flag = true;
                    //Calculate() function call for functionality 2/2 should give 1 before any other operation.
                    //Calculate() also prevent the user errors like 2///2, 2/+-/2 etc
                    calculate();
                    OPERATION = "div";
                    output.setText(String.valueOf(operand1 + "/"));
                    input.setText(null);
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str1 = input.getText().toString();
                //Solution for Null Inputs...This prevents the NumberFormattedException while parsing the null values in parseDouble()
                if(str1.equals(""))
                {
                    val = 0.0;
                }
                else
                {
                    val = Double.parseDouble(str1);
                }
                input.setText(val*-1 + "");         //Toggling the signs for +/- button
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //For allowing the only one dot in a number, this flag must be true
                //In operations like "+,-,/,* , clear" this should be true because other operand can be decimal number
                if(dot_flag)
                {
                    input.setText(input.getText() + ".");
                    dot_flag=false;
                }
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                calculate();
                OPERATION = "res";
                //This flag is used for "2+=" - > "2+"
                if(result_flag == false)
                {
                    if (output.getText().toString().contains("'"))
                    {
                        ; //Do Nothing
                    }
                    else if (!output.getText().toString().contains("="))
                    {
                        output.setText(output.getText() + String.valueOf(operand2) + "=" + String.valueOf(operand1)); //this will print the result 2.0 + 2.0 = 4.0 only once if = is pressed more than once at a time
                    }
                    input.setText(null);
                }
            }
        });

        mem_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //clearing the memory variable (MC)
                memory = 0;
            }
        });

        mem_recall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str1 = String.valueOf(memory);
                input.setText(str1); //setting the memory variable to textview for memory recall (MR)
            }
        });

        mem_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Handling the null inputs
                //After pressing the M+, memory variable gets added to input and updated
                str1 = input.getText().toString();
                if(str1.equals(""))
                {
                    memory = memory + 0.0 ;
                }
                else
                {
                    memory = memory + Double.parseDouble(str1);
                }
            }
        });

        mem_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Handling the null inputs
                //After pressing the M-, input gets subtracted from memory variable and memory variable will get updated
                str1 = input.getText().toString();
                if(str1.equals(""))
                {
                    memory = memory - 0.0 ;
                }
                else
                {
                    memory = memory - Double.parseDouble(str1);
                }
            }
        });
    }

    //Assigning the values to operand1 and operand2 with handling null inputs
    //Doing the Addition, Subtraction, Multiplication, Division with IF ELSE ladder
    //Preventing crash while Divide by zero operation
    private void calculate()
    {
        if(!Double.isNaN(operand1))
        {
            str1 = input.getText().toString();
            if(str1.equals(""))
            {
                output.setText(output.getText());
            }
            else
            {
                operand2 = Double.parseDouble(str1);

                if (OPERATION.equals("add"))
                {
                    operand1 = operand1 + operand2;
                }
                else if (OPERATION.equals("sub"))
                {
                    operand1 = operand1 - operand2;
                }
                else if (OPERATION.equals("mul"))
                {
                    operand1 = operand1 * operand2;

                }
                else if (OPERATION.equals("div"))
                {
                    if (operand2 == 0)
                    {
                        output.setText("Can't Divide By Zero");
                    }
                    else
                    {
                        operand1 = operand1 / operand2;
                    }
                }
                else if (OPERATION.equals("res"))
                {
                    result_flag=false;
                }
            }
        }
        else
        {
            operand1 = Double.parseDouble(input.getText().toString());
        }
    }
}
