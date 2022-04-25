package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author main@m42.cx
 */
public class ElementMain extends PeerFamily {
    private ElementMain() {
        id = "element.main"; // Do not change this id as wallets serialize this string



        addressHeader = 117;
        p2shHeader = 8;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 245;

        name = "Element";
        symbol = "HYP";
        uriScheme = "element";
        bip44Index = 0;
        unitExponent = 6;
        feeValue = value(10000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(5000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Element Signed Message:\n");

    }

    private static ElementMain instance = new ElementMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
