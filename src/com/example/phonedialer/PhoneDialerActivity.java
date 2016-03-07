package com.example.phonedialer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class PhoneDialerActivity extends Activity {
	
	class ButtonListener implements View.OnClickListener {

		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			EditText input = (EditText)findViewById(R.id.edittext);
			switch(view.getId()) {
				case R.id.button0:
					input.append("0");
					break;
				case R.id.button1:
					input.append("1");
					break;
				case R.id.button2:
					input.append("2");
					break;
				case R.id.button3:
					input.append("3");
					break;
				case R.id.button4:
					input.append("4");
					break;
				case R.id.button5:
					input.append("5");
					break;
				case R.id.button6:
					input.append("6");
					break;
				case R.id.button7:
					input.append("7");
					break;
				case R.id.button8:
					input.append("8");
					break;
				case R.id.button9:
					input.append("9");
					break;
				case R.id.button10:
					input.append("*");
					break;
				case R.id.button11:
					input.append("#");
					break;
				case R.id.buttoncall:
					break;
				case R.id.buttonhangup:
					break;
				case R.id.buttonbackspace:
					String text = input.getText().toString();
					if(!text.isEmpty()) {
						text = text.substring(0, text.length()-1);
					}
					input.setText(text);
					break;
					
			}
		}
		
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        Button buttons[] = new Button[12];
        buttons[0] = (Button)findViewById(R.id.button1);
        buttons[1] = (Button)findViewById(R.id.button2);
        buttons[2] = (Button)findViewById(R.id.button3);
        buttons[3] = (Button)findViewById(R.id.button4);
        buttons[4] = (Button)findViewById(R.id.button5);
        buttons[5] = (Button)findViewById(R.id.button6);
        buttons[6] = (Button)findViewById(R.id.button7);
        buttons[7] = (Button)findViewById(R.id.button8);
        buttons[8] = (Button)findViewById(R.id.button9);
        buttons[9] = (Button)findViewById(R.id.button0);
        buttons[10] = (Button)findViewById(R.id.button10);
        buttons[11] = (Button)findViewById(R.id.button11);
        
        ImageButton call = (ImageButton)findViewById(R.id.buttoncall);
        ImageButton hangup = (ImageButton)findViewById(R.id.buttonhangup);
        ImageButton backspace = (ImageButton)findViewById(R.id.buttonbackspace);
        
        int i;
        ButtonListener l = new ButtonListener();
        for(i = 0; i < buttons.length; i++) {
        	buttons[i].setOnClickListener(l);
        }
        call.setOnClickListener(l);
        hangup.setOnClickListener(l);
        backspace.setOnClickListener(l);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
