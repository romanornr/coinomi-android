package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

public Class ViacoinMain extends BitFamily {
    private ViacoinMain() {
        id = "viacoin.main";

        addressHeader = 71;
        p2shHeader = 33;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 3600;
        dumpedPrivateKeyHeader = 199;

        name = "Viacoin";
        symbol = "VIA";
        uriScheme  = "viacoin";
        bip44Index = 14;
        unitExponent = 8;
        feeValue = value(10000);
        minNonDust = value(100000); // VIA miniput
        softDusLimit = value(100000); // 0.001 VIA
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Viacoin Signed Message:\n");
    }

    private static ViacoinMain instance = new ViacoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
