/**
 * Copyright (C) 2008 - Abiquo Holdings S.L. All rights reserved.
 *
 * Please see /opt/abiquo/tomcat/webapps/legal/ on Abiquo server
 * or contact contact@abiquo.com for licensing information.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.abiquo.aimstub;

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum DomainState implements org.apache.thrift.TEnum
{
    ON(1), OFF(2), PAUSED(3), UNKNOWN(4);

    private final int value;

    private DomainState(int value)
    {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue()
    {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     * 
     * @return null if the value is not found.
     */
    public static DomainState findByValue(int value)
    {
        switch (value)
        {
            case 1:
                return ON;
            case 2:
                return OFF;
            case 3:
                return PAUSED;
            case 4:
                return UNKNOWN;
            default:
                return null;
        }
    }
}
