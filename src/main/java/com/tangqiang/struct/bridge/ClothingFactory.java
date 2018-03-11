package com.tangqiang.struct.bridge;

/**
 * TODO
 *
 * @author tangqiang
 */
public class ClothingFactory {
    public static Clothing getClothing() {
        return new Clothing() {
            @Override
            public void personDressCloth(Person person) {

            }
        };
    }
}
