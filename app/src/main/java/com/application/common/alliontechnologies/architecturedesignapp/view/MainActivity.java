package com.application.common.alliontechnologies.architecturedesignapp.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.application.common.alliontechnologies.architecturedesignapp.R;
import com.application.common.alliontechnologies.architecturedesignapp.databinding.ActivityMainBinding;
import com.application.common.alliontechnologies.architecturedesignapp.events.LoginEvent;
import com.application.common.alliontechnologies.architecturedesignapp.events.PopUpActionEvent;
import com.application.common.alliontechnologies.architecturedesignapp.model.User;
import com.application.common.alliontechnologies.architecturedesignapp.utils.PopUpDialog;
import com.application.common.alliontechnologies.architecturedesignapp.utils.Validation;
import com.application.common.alliontechnologies.architecturedesignapp.viewmodel.UserModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    EditText etxt_userName, etxt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        etxt_userName = (EditText) findViewById(R.id.etxt_userName);
        etxt_password = (EditText) findViewById(R.id.etxt_password);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserModel userModel = new UserModel(new User("UserName", "Password"));
        activityMainBinding.setUser(userModel);

        activityMainBinding.setLoginEvent(new LoginEvent() {
            @Override
            public void Login() {

                    if (activityMainBinding.getUser().getUserName().equals("Pasindu") && activityMainBinding.getUser().getPassword().equals("123456")) {


                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);

                    } else {

                        Toast.makeText(getApplicationContext(), "Something Went Wrong, Please Check fields again !!!", Toast.LENGTH_LONG).show();

                    }

            }
        });

        activityMainBinding.setPopUpEvent(new PopUpActionEvent() {
            @Override
            public void openPopUpDialog() {

                PopUpDialog.PopUpDialogShow("Write Somthing Here. It will show in the popup","",MainActivity.this,this);
            }

            @Override
            public void onYesClicked() {

                Toast.makeText(getApplicationContext(), "YES", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNoClicked() {

                Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_LONG).show();

            }
        });

        ButterKnife.bind(this);
    }


}
