package com.cucci.bridge;

/**
 * 桥接模式测试
 *
 * @author shenyw
 **/
public class BridgeTest {

    public static void main(String[] args) {
        HandsetBrand brand;
        brand = new HandsetBrandN();

        brand.setHandsetSoft(new HandsetGame());
        brand.run();

        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();

        brand = new HandsetBrandM();

        brand.setHandsetSoft(new HandsetGame());
        brand.run();

        brand.setHandsetSoft(new HandsetAddressList());
        brand.run();

        // 如果需要添加一个手机软件Mp3，只需要增加一个Mp3类并继承HandsetSoft即可
        // 如果需要添加一个品牌S, 只需要增加一个S品牌的类，并继承HandsetBrand即可
        // 桥接模式的核心：优先使用对象的合成/聚合将有助于你保持每个类的封装，并被集中在单个任务上
    }
}
