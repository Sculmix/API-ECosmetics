package ru.sculmix.ecosmetics.utils;

public class MCNotInstalledException extends UnsupportedOperationException {
    public MCNotInstalledException() {
        super("Error: MagicCosmetics is not installed, please install it to use this API.");
    }
}
