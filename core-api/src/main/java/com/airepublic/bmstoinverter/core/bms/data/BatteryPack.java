package com.airepublic.bmstoinverter.core.bms.data;

/**
 * Holds all the data of a set of battery cells - a battery pack - collected from the BMS.
 *
 * Comments specify the precision and units of the value.
 */
public class BatteryPack {
    // data from 0x53
    /** Battery type: 0=lithium iron, 1=ternary lithium, 2=lithium titanate */
    public int type;
    // data from 0x50
    /** Capacity of the each cell (1mAh) */
    public int ratedCapacitymAh;
    /** Nominal cell voltage (1mV) */
    public int ratedCellmV;

    // data from 0x5A
    /** Maximum total voltage (0.1V) */
    public int maxPackVoltageLimit;
    /** Minimum total voltage (0.1V) */
    public int minPackVoltageLimit;

    // data from 0x5B
    /** Maximum total charge current (30000 - x 0.1A) */
    public int maxPackChargeCurrent;
    /** Maximum total discharge current (30000 - x 0.1A) */
    public int maxPackDischargeCurrent;

    // data from 0x90
    /** Total pack voltage (0.1 V) */
    public int packVoltage;
    /** Current in (+) or out (-) of pack (0.1 A) */
    public int packCurrent;
    /** State Of Charge (0.1%) */
    public int packSOC;
    /** State of Health (0.1%) */
    public int packSOH;

    // data from 0x91
    /** Maximum cell voltage (mV) */
    public int maxCellmV;
    /** Number of cell with highest voltage */
    public int maxCellVNum;
    /** Minimum cell voltage (mV) */
    public int minCellmV;
    /** Number of cell with lowest voltage */
    public int minCellVNum;
    /** Difference between min and max cell voltages */
    public int cellDiffmV;

    // data from 0x92
    /** Maximum temperature sensor reading (0.1C) */
    public int tempMax;
    /** Minimum temperature sensor reading (0.1C) */
    public int tempMin;
    /** Average of temp sensors (0.1C) */
    public int tempAverage;

    // data from 0x93
    /** charge/discharge status (0 stationary, 1 charge, 2 discharge) */
    public String chargeDischargeStatus = "";
    /** charging MOSFET status */
    public boolean chargeMOSState;
    /** discharge MOSFET state */
    public boolean disChargeMOSState;
    /** force charging */
    public boolean forceCharge;
    /** The flag if charging is forbidden */
    public boolean chargeForbidden;
    /** The flag if discharging is forbidden */
    public boolean dischargeForbidden;

    /** BMS life (0~255 cycles)? */
    public int bmsHeartBeat;
    /** residual capacity mAH */
    public int remainingCapacitymAh;

    // data from 0x94
    /** Cell count */
    public int numberOfCells;
    /** Temp sensor count */
    public int numOfTempSensors;
    /** charger status 0 = disconnected 1 = connected */
    public boolean chargeState;
    /** Load Status 0=disconnected 1=connected */
    public boolean loadState;
    /** No information about this */
    public boolean dIO[] = new boolean[8];
    /** charge / discharge cycles */
    public int bmsCycles;

    // data from 0x95
    /** Store Cell Voltages (mV) */
    public int cellVmV[] = new int[48];

    // data from 0x96
    /** array of cell Temperature sensors */
    public int cellTemperature[] = new int[16];

    // data from 0x97
    /** boolean array of cell balance states */
    public boolean[] cellBalanceState = new boolean[48];
    /** boolean is cell balance active */
    public boolean cellBalanceActive;

    // data from 0x98
    /** alarm states */
    public Alarms alarms = new Alarms();
    //
    /** The manufacturer code */
    public String manufacturerCode = "";
    /** The hardware version */
    public String hardwareVersion = "";
    /** The software version */
    public String softwareVersion = "";

    /** The cell with the maximum temperature */
    public int tempMaxCellNum;
    /** The cell with the minimum temperature */
    public int tempMinCellNum;

    /** The maximum module voltage (0.001V) of a pack */
    public int maxModulemV;
    /** The minimum module voltage (0.001V) of a pack */
    public int minModulemV;
    /** The number of the pack with the maximum voltage */
    public int maxModulemVNum;
    /** The number of the pack with the minimum voltage */
    public int minModulemVNum;
    /** The maximum module temperature (0.1C) */
    public int maxModuleTemp;
    /** The minimum module temperature (0.1C) */
    public int minModuleTemp;
    /** The pack number with maximum module temperature */
    public int maxModuleTempNum;
    /** The pack number with minimum module temperature */
    public int minModuleTempNum;
    /** The number of battery modules in series */
    public byte modulesInSeries;
    /** The number of cells in a module */
    public byte moduleNumberOfCells;
    /** The module voltage (1V) */
    public int moduleVoltage;
    /** The rated capacity of the module (1Ah) */
    public int moduleRatedCapacityAh;

}
