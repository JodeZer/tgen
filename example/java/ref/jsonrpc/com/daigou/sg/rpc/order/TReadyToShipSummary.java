package com.daigou.sg.rpc.order;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TReadyToShipSummary extends BaseModule<TReadyToShipSummary> implements Serializable {
    public int arrivedCount;
    public int notArrivedCount;
    public ArrayList<TOrder> orders;
    public com.daigou.sg.rpc.payment.TPaymentBill paymentBill;
}