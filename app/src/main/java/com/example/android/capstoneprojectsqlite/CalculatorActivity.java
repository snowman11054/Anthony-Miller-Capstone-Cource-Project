package com.example.android.capstoneprojectsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    // counters
    private int bearingCount = 0;
    private int buttonCount = 0;
    private int chestCount = 0;
    private int largeChestCount = 0;
    private int batteryContainerCount = 0;
    private int chemicalContainerCount = 0;
    private int gasContainerCount = 0;
    private int waterContainerCount = 0;
    private int controllerCount = 0;
    private int drillCount = 0;
    private int electricEngineCount = 0;
    private int gasEngineCount = 0;
    private int headlightCount = 0;
    private int logicGateCount = 0;
    private int pistonCount = 0;
    private int driverSaddleCount = 0;
    private int saddleCount = 0;
    private int sawBladeCount = 0;
    private int driverSeatCount = 0;
    private int seatCount = 0;
    private int sensorCount = 0;
    private int offRoadSuspensionCount = 0;
    private int sportSuspensionCount = 0;
    private int switchCount = 0;
    private int thrusterCount = 0;
    private int timerCount = 0;
    private int vacuumPipeCount = 0;
    private int vacuumPipeCornerCount = 0;
    private int vacuumPumpCount = 0;
    private int waterCannonCount = 0;
    private int wheelCount = 0;
    private int bigWheelCount = 0;

    // counter TextViews
    TextView bearingCount_tv;
    TextView buttonCount_tv;
    TextView chestCount_tv;
    TextView largeChestCount_tv;
    TextView batteryContainerCount_tv;
    TextView chemicalContainerCount_tv;
    TextView gasContainerCount_tv;
    TextView waterContainerCount_tv;
    TextView controllerCount_tv;
    TextView drillCount_tv;
    TextView electricEngineCount_tv;
    TextView gasEngineCount_tv;
    TextView headlightCount_tv;
    TextView logicGateCount_tv;
    TextView pistonCount_tv;
    TextView driverSaddleCount_tv;
    TextView saddleCount_tv;
    TextView sawBladeCount_tv;
    TextView driverSeatCount_tv;
    TextView seatCount_tv;
    TextView sensorCount_tv;
    TextView offRoadSuspensionCount_tv;
    TextView sportSuspensionCount_tv;
    TextView switchCount_tv;
    TextView thrusterCount_tv;
    TextView timerCount_tv;
    TextView vacuumPipeCount_tv;
    TextView vacuumPipeCornerCount_tv;
    TextView vacuumPumpCount_tv;
    TextView waterCannonCount_tv;
    TextView wheelCount_tv;
    TextView bigWheelCount_tv;

    // resources
    TextView scrapMetal_tv;
    TextView metalBlock1_tv;
    TextView scrapStoneBlock_tv;
    TextView woodBlock1_tv;
    TextView componentKit_tv;
    TextView circuitBoard_tv;
    TextView water_tv;
    TextView ember_tv;
    TextView clamGlue_tv;
    TextView oil_tv;
    TextView chemical_tv;
    TextView beesWax_tv;
    TextView cotton_tv;
    TextView glow_tv;
    TextView flowerPigment_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button homeScreen = findViewById(R.id.home_btn);
        Button recipes = findViewById(R.id.recipes_btn);

        Button addBearing = findViewById(R.id.addBearing);
        Button addButton = findViewById(R.id.addButton);
        Button addChest = findViewById(R.id.addChest);
        Button addLargerChest = findViewById(R.id.addLargeChest);
        Button addBatteryContainer = findViewById(R.id.addBatteryContainer);
        Button addChemicalContainer = findViewById(R.id.addContainerChemical);
        Button addGasContainer = findViewById(R.id.addGasContainer);
        Button addWaterContainer = findViewById(R.id.addWaterContainer);
        Button addController = findViewById(R.id.addController);
        Button addDrill = findViewById(R.id.addDrill);
        Button addElectricEngine = findViewById(R.id.addElectricEngine);
        Button addGasEngine = findViewById(R.id.addGasEngine);
        Button addHeadlight = findViewById(R.id.addHeadlight);
        Button addLogicGate = findViewById(R.id.addLogicGate);
        Button addPiston = findViewById(R.id.addPiston);
        Button addDriverSaddle = findViewById(R.id.addDriverSaddle);
        Button addSaddle = findViewById(R.id.addSaddle);
        Button addSawBlade = findViewById(R.id.addSawBlade);
        Button addDriverSeat = findViewById(R.id.addDriverSeat);
        Button addSeat = findViewById(R.id.addSeat);
        Button addSensor = findViewById(R.id.addSensor);
        Button addOffRoadSuspension = findViewById(R.id.addSuspensionOffRoad);
        Button addSportSuspension = findViewById(R.id.addSportSuspension);
        Button addSwitch = findViewById(R.id.addSwitch);
        Button addThruster = findViewById(R.id.addThruster);
        Button addTimer = findViewById(R.id.addTimer);
        Button addVacuumPipe = findViewById(R.id.addVacuumPipe);
        Button addVacuumPipeCorner = findViewById(R.id.addVacuumPipeCorner);
        Button addVacuumPump = findViewById(R.id.addVacuumPump);
        Button addWaterCannon = findViewById(R.id.addWaterCannon);
        Button addWheel = findViewById(R.id.addWheel);
        Button addBigWheel = findViewById(R.id.addBigWheel);

        Button minusBearing = findViewById(R.id.minusBearing);
        Button minusButton = findViewById(R.id.minusButton);
        Button minusChest = findViewById(R.id.minusChest);
        Button minusLargerChest = findViewById(R.id.minusLargeChest);
        Button minusBatteryContainer = findViewById(R.id.minusBatteryContainer);
        Button minusChemicalContainer = findViewById(R.id.minusContainerChemical);
        Button minusGasContainer = findViewById(R.id.minusGasContainer);
        Button minusWaterContainer = findViewById(R.id.minusWaterContainer);
        Button minusController = findViewById(R.id.minusController);
        Button minusDrill = findViewById(R.id.minusDrill);
        Button minusElectricEngine = findViewById(R.id.minusElectricEngine);
        Button minusGasEngine = findViewById(R.id.minusGasEngine);
        Button minusHeadlight = findViewById(R.id.minusHeadlight);
        Button minusLogicGate = findViewById(R.id.minusLogicGate);
        Button minusPiston = findViewById(R.id.minusPiston);
        Button minusDriverSaddle = findViewById(R.id.minusDriverSaddle);
        Button minusSaddle = findViewById(R.id.minusSaddle);
        Button minusSawBlade = findViewById(R.id.minusSawBlade);
        Button minusDriverSeat = findViewById(R.id.minusDriverSeat);
        Button minusSeat = findViewById(R.id.minusSeat);
        Button minusSensor = findViewById(R.id.minusSensor);
        Button minusOffRoadSuspension = findViewById(R.id.minusSuspensionOffRoad);
        Button minusSportSuspension = findViewById(R.id.minusSportSuspension);
        Button minusSwitch = findViewById(R.id.minusSwitch);
        Button minusThruster = findViewById(R.id.minusThruster);
        Button minusTimer = findViewById(R.id.minusTimer);
        Button minusVacuumPipe = findViewById(R.id.minusVacuumPipe);
        Button minusVacuumPipeCorner = findViewById(R.id.minusVacuumPipeCorner);
        Button minusVacuumPump = findViewById(R.id.minusVacuumPump);
        Button minusWaterCannon = findViewById(R.id.minusWaterCannon);
        Button minusWheel = findViewById(R.id.minusWheel);
        Button minusBigWheel = findViewById(R.id.minusBigWheel);

        bearingCount_tv = findViewById(R.id.bearingCount_tv);
        buttonCount_tv = findViewById(R.id.buttonCount_tv);
        chestCount_tv = findViewById(R.id.chestCount_tv);
        largeChestCount_tv = findViewById(R.id.largeChestCount_tv);
        batteryContainerCount_tv = findViewById(R.id.batteryContainerCount_tv);
        chemicalContainerCount_tv = findViewById(R.id.containerChemicalCount_tv);
        gasContainerCount_tv = findViewById(R.id.gasContainerCount_tv);
        waterContainerCount_tv = findViewById(R.id.waterContainerCount_tv);
        controllerCount_tv = findViewById(R.id.controllerCount_tv);
        drillCount_tv = findViewById(R.id.drillCount_tv);
        electricEngineCount_tv = findViewById(R.id.electricEngineCount_tv);
        gasEngineCount_tv = findViewById(R.id.gasEngineCount_tv);
        headlightCount_tv = findViewById(R.id.headlightCount_tv);
        logicGateCount_tv = findViewById(R.id.logicGateCount_tv);
        pistonCount_tv = findViewById(R.id.pistonCount_tv);
        driverSaddleCount_tv = findViewById(R.id.driverSaddleCount_tv);
        saddleCount_tv = findViewById(R.id.saddleCount_tv);
        sawBladeCount_tv = findViewById(R.id.sawBladeCount_tv);
        driverSeatCount_tv = findViewById(R.id.driverSeatCount_tv);
        seatCount_tv = findViewById(R.id.seatCount_tv);
        sensorCount_tv = findViewById(R.id.sensorCount_tv);
        offRoadSuspensionCount_tv = findViewById(R.id.suspensionOffRoadCount_tv);
        sportSuspensionCount_tv = findViewById(R.id.sportSuspensionCount_tv);
        switchCount_tv = findViewById(R.id.switchCount_tv);
        thrusterCount_tv = findViewById(R.id.thrusterCount_tv);
        timerCount_tv = findViewById(R.id.timerCount_tv);
        vacuumPipeCount_tv = findViewById(R.id.vacuumPipeCount_tv);
        vacuumPipeCornerCount_tv = findViewById(R.id.vacuumPipeCornerCount_tv);
        vacuumPumpCount_tv = findViewById(R.id.vacuumPumpCount_tv);
        waterCannonCount_tv = findViewById(R.id.waterCannonCount_tv);
        wheelCount_tv = findViewById(R.id.wheelCount_tv);
        bigWheelCount_tv = findViewById(R.id.bigWheelCount_tv);

        // raw resource TextViews
        scrapMetal_tv = findViewById(R.id.scrapMetal_tv);
        metalBlock1_tv = findViewById(R.id.metalBlock1_tv);
        scrapStoneBlock_tv = findViewById(R.id.scrapStone_tv);
        woodBlock1_tv = findViewById(R.id.woodBlock1_tv);
        componentKit_tv = findViewById(R.id.componentKit_tv);
        circuitBoard_tv = findViewById(R.id.circuitBoard_tv);
        water_tv = findViewById(R.id.water_tv);
        ember_tv = findViewById(R.id.ember_tv);
        clamGlue_tv = findViewById(R.id.clamGlue_tv);
        oil_tv = findViewById(R.id.oil_tv);
        chemical_tv = findViewById(R.id.chemical_tv);
        beesWax_tv = findViewById(R.id.beesWax_tv);
        cotton_tv = findViewById(R.id.cotton_tv);
        glow_tv = findViewById(R.id.glow_tv);
        flowerPigment_tv = findViewById(R.id.flowerPigment_tv);


        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action.equals("finish_activity")) {
                    finish();
                }
            }
        };
        registerReceiver(broadcastReceiver, new IntentFilter("finish_activity"));

        homeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, HomeScreenActivity.class);
                CalculatorActivity.this.startActivity(intent);
            }
        });

        recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, RecipeActivity.class);
                CalculatorActivity.this.startActivity(intent);
            }
        });


        // addition buttons
        addBearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bearingCount++;
                updateResources();
                bearingCount_tv.setText(String.valueOf(bearingCount));
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCount++;
                updateResources();
                buttonCount_tv.setText(buttonCount);
            }
        });
        addChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chestCount++;
                updateResources();
                chestCount_tv.setText(chestCount);
            }
        });
        addLargerChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                largeChestCount++;
                updateResources();
                largeChestCount_tv.setText(largeChestCount);
            }
        });
        addBatteryContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                batteryContainerCount++;
                updateResources();
                batteryContainerCount_tv.setText(batteryContainerCount);
            }
        });
        addChemicalContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chemicalContainerCount++;
                updateResources();
                chemicalContainerCount_tv.setText(chemicalContainerCount);
            }
        });
        addGasContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gasContainerCount++;
                updateResources();
                gasContainerCount_tv.setText(gasContainerCount);
            }
        });
        addWaterContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waterContainerCount++;
                updateResources();
                waterContainerCount_tv.setText(waterContainerCount);
            }
        });
        addController.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controllerCount++;
                updateResources();
                controllerCount_tv.setText(controllerCount);
            }
        });
        addDrill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drillCount++;
                updateResources();
                drillCount_tv.setText(drillCount);
            }
        });
        addElectricEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                electricEngineCount++;
                updateResources();
                electricEngineCount_tv.setText(electricEngineCount);
            }
        });
        addGasEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gasEngineCount++;
                updateResources();
                gasEngineCount_tv.setText(gasEngineCount);
            }
        });
        addHeadlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                headlightCount++;
                updateResources();
                headlightCount_tv.setText(String.valueOf(headlightCount));
            }
        });
        addLogicGate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logicGateCount++;
                updateResources();
                logicGateCount_tv.setText(String.valueOf(logicGateCount));
            }
        });
        addPiston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pistonCount++;
                updateResources();
                pistonCount_tv.setText(String.valueOf(pistonCount));
            }
        });
        addDriverSaddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                driverSaddleCount++;
                updateResources();
                driverSaddleCount_tv.setText(String.valueOf(driverSaddleCount));
            }
        });
        addSaddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saddleCount++;
                updateResources();
                saddleCount_tv.setText(String.valueOf(saddleCount));
            }
        });
        addSawBlade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sawBladeCount++;
                updateResources();
                sawBladeCount_tv.setText(String.valueOf(sawBladeCount));
            }
        });
        addDriverSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                driverSeatCount++;
                updateResources();
                driverSeatCount_tv.setText(String.valueOf(driverSeatCount));
                }
        });
        addSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seatCount++;
                updateResources();
                seatCount_tv.setText(String.valueOf(seatCount));
            }
        });
        addSensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sensorCount++;
                updateResources();
                sensorCount_tv.setText(String.valueOf(sensorCount));
            }
        });
        addOffRoadSuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                offRoadSuspensionCount++;
                updateResources();
                offRoadSuspensionCount_tv.setText(String.valueOf(offRoadSuspensionCount));
            }
        });
        addSportSuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sportSuspensionCount++;
                updateResources();
                sportSuspensionCount_tv.setText(String.valueOf(sportSuspensionCount));
            }
        });
        addSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCount++;
                updateResources();
                switchCount_tv.setText(String.valueOf(switchCount));
            }
        });
        addThruster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addVacuumPipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addVacuumPipeCorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addVacuumPump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addWaterCannon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        addBigWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        // minus buttons
        minusBearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bearingCount > 0){
                    bearingCount--;
                    updateResources();
                    bearingCount_tv.setText(String.valueOf(bearingCount));
                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusLargerChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusBatteryContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusChemicalContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusGasContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusWaterContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusController.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusDrill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusElectricEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusGasEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusHeadlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusLogicGate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusPiston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusDriverSaddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusSaddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusSawBlade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusDriverSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusSensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusOffRoadSuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusSportSuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusThruster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusVacuumPipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusVacuumPipeCorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusVacuumPump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusWaterCannon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        minusBigWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    /**
     * updates the resource counters on the display
     */
    private void updateResources(){

        int scrapMetal = (bearingCount * 5) + buttonCount + switchCount + (electricEngineCount * 10);

        // calculating glass
        int glassBlock = sensorCount
                + headlightCount
                + (vacuumPipeCount * 10)
                + (vacuumPipeCornerCount * 10)
                + (chemicalContainerCount *20);

        double count_GB = Math.ceil(glassBlock / 10);

        int ember_GB = (int)count_GB;
        int scrapStone_GB = (5 * (int)count_GB);

        // calculating metal 3
        int metalBlock3 = thrusterCount * 40;

        double count_MB3 = Math.ceil(metalBlock3 / 10);

        int ember_MB3 = (2 * (int)count_MB3);
        int water_MB3 = (4 * (int)count_MB3);
        int metalBlock2_MB3 = (20 * (int)count_MB3);

        // calculating metal 2
        int metalBlock2 = metalBlock2_MB3
                + (sportSuspensionCount * 5)
                + (offRoadSuspensionCount * 10)
                + (driverSeatCount * 5)
                + (pistonCount * 10)
                + (electricEngineCount * 20)
                + (vacuumPumpCount * 10)
                + (vacuumPipeCount * 5)
                + (vacuumPipeCornerCount * 5)
                + (batteryContainerCount * 20)
                + (waterCannonCount * 10)
                + (chemicalContainerCount * 10)
                + (sawBladeCount * 10)
                + (drillCount * 20);

        double count_MB2 = Math.ceil(metalBlock2 / 10);

        int ember_MB2 = (int)count_MB2;
        int water_MB2 = (2 * (int)count_MB2);
        int metalBlock1_MB2 = (15 * (int)count_MB2);

        int metalBlock1 = metalBlock1_MB2
                + (chestCount * 40)
                + sensorCount
                + (gasEngineCount * 20)
                + (driverSeatCount * 5)
                + (seatCount * 5)
                + (driverSaddleCount * 5)
                + (saddleCount * 5)
                + (controllerCount * 5)
                + logicGateCount
                + (timerCount * 2)
                + headlightCount
                + (largeChestCount * 60)
                + (gasContainerCount * 20)
                + (waterContainerCount * 10)
                + (sawBladeCount * 20)
                + (drillCount * 30)
                + (wheelCount * 5)
                + (bigWheelCount * 10);

        int scrapStoneBlock = scrapStone_GB;

        int woodBlock1 = (wheelCount * 15) + (bigWheelCount * 40);

        int componentKit = pistonCount
                + (gasEngineCount * 3)
                + driverSeatCount
                + driverSaddleCount
                + (thrusterCount * 10)
                + controllerCount
                + (largeChestCount * 3)
                + (vacuumPumpCount * 3)
                + (waterCannonCount * 2);

        int circuitBoard = (buttonCount * 2)
                + (switchCount * 2)
                + (sensorCount * 2)
                + (pistonCount * 2)
                + (gasEngineCount * 5)
                + (electricEngineCount * 10)
                + (driverSeatCount * 3)
                + (seatCount * 2)
                + (driverSaddleCount * 3)
                + (saddleCount * 2)
                + (controllerCount * 5)
                + logicGateCount
                + (timerCount * 2)
                + (headlightCount * 2)
                + (largeChestCount * 5)
                + (vacuumPumpCount * 5)
                + (vacuumPipeCount * 2)
                + (vacuumPipeCornerCount * 2)
                + (gasContainerCount * 5)
                + (batteryContainerCount * 10)
                + (waterContainerCount * 5)
                + (chemicalContainerCount * 5);

        int water = water_MB3 + water_MB2;

        int ember = ember_MB3 + ember_MB2 + ember_GB;

        int clamGlue = (chestCount * 6)
                + (sensorCount * 6)
                + (controllerCount * 9)
                + (logicGateCount * 3)
                + (timerCount * 3)
                + (headlightCount * 3)
                + (largeChestCount * 15)
                + (gasContainerCount * 6)
                + (batteryContainerCount * 6)
                + (waterContainerCount * 6)
                + (chemicalContainerCount * 6);

        int oil = (sportSuspensionCount * 2)
                + (offRoadSuspensionCount * 2)
                + (pistonCount * 2)
                + (gasEngineCount * 5)
                + (electricEngineCount * 5);

        int beesWax = (vacuumPumpCount * 5)
                + (waterContainerCount * 10)
                + (waterCannonCount * 10)
                + (wheelCount * 6)
                + (bigWheelCount * 8);

        int cotton = ((driverSeatCount + seatCount) * 10) + ((driverSaddleCount + saddleCount) * 5);

        int flowerPigment = (gasContainerCount * 75) + (batteryContainerCount * 75);

        int chemical = electricEngineCount * 5;

        int glow = electricEngineCount * 5;

        // Setting the resource values
        scrapMetal_tv.setText(String.valueOf(scrapMetal));
        metalBlock1_tv.setText(String.valueOf(metalBlock1));
        scrapStoneBlock_tv.setText(String.valueOf(scrapStoneBlock));
        woodBlock1_tv.setText(String.valueOf(woodBlock1));
        componentKit_tv.setText(String.valueOf(componentKit));
        circuitBoard_tv.setText(String.valueOf(circuitBoard));
        water_tv.setText(String.valueOf(water + water_MB2));
        ember_tv.setText(String.valueOf(ember));
        clamGlue_tv.setText(String.valueOf(clamGlue));
        oil_tv.setText(String.valueOf(oil));
        chemical_tv.setText(String.valueOf(chemical));
        beesWax_tv.setText(String.valueOf(beesWax));
        cotton_tv.setText(String.valueOf(cotton));
        glow_tv.setText(String.valueOf(glow));
        flowerPigment_tv.setText(String.valueOf(flowerPigment));
    }
}