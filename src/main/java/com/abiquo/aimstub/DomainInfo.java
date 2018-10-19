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

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-2-8")
public class DomainInfo implements org.apache.thrift.TBase<DomainInfo, DomainInfo._Fields>,
    java.io.Serializable, Cloneable, Comparable<DomainInfo>
{
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC =
        new org.apache.thrift.protocol.TStruct("DomainInfo");

    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC =
        new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING,
            (short) 1);

    private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC =
        new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRING,
            (short) 2);

    private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC =
        new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32,
            (short) 3);

    private static final org.apache.thrift.protocol.TField NUMBER_VIRT_CPU_FIELD_DESC =
        new org.apache.thrift.protocol.TField("numberVirtCpu", org.apache.thrift.protocol.TType.I32,
            (short) 4);

    private static final org.apache.thrift.protocol.TField MEMORY_FIELD_DESC =
        new org.apache.thrift.protocol.TField("memory", org.apache.thrift.protocol.TType.DOUBLE,
            (short) 5);

    private static final org.apache.thrift.protocol.TField XML_DESC_FIELD_DESC =
        new org.apache.thrift.protocol.TField("xmlDesc", org.apache.thrift.protocol.TType.STRING,
            (short) 6);

    private static final Map<Class< ? extends IScheme>, SchemeFactory> schemes =
        new HashMap<Class< ? extends IScheme>, SchemeFactory>();
    static
    {
        schemes.put(StandardScheme.class, new DomainInfoStandardSchemeFactory());
        schemes.put(TupleScheme.class, new DomainInfoTupleSchemeFactory());
    }

    public String name; // required

    public String uuid; // required

    /**
     * @see DomainState
     */
    public DomainState state; // required

    public int numberVirtCpu; // required

    public double memory; // required

    public String xmlDesc; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum
    {
        NAME((short) 1, "name"),
        UUID((short) 2, "uuid"),
        /**
         * @see DomainState
         */
        STATE((short) 3, "state"),
        NUMBER_VIRT_CPU((short) 4, "numberVirtCpu"),
        MEMORY((short) 5, "memory"),
        XML_DESC((short) 6, "xmlDesc");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static
        {
            for (_Fields field : EnumSet.allOf(_Fields.class))
            {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId)
        {
            switch (fieldId)
            {
                case 1: // NAME
                    return NAME;
                case 2: // UUID
                    return UUID;
                case 3: // STATE
                    return STATE;
                case 4: // NUMBER_VIRT_CPU
                    return NUMBER_VIRT_CPU;
                case 5: // MEMORY
                    return MEMORY;
                case 6: // XML_DESC
                    return XML_DESC;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId)
        {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name)
        {
            return byName.get(name);
        }

        private final short _thriftId;

        private final String _fieldName;

        _Fields(short thriftId, String fieldName)
        {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId()
        {
            return _thriftId;
        }

        public String getFieldName()
        {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __NUMBERVIRTCPU_ISSET_ID = 0;

    private static final int __MEMORY_ISSET_ID = 1;

    private byte __isset_bitfield = 0;

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static
    {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap =
            new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.NAME,
            new org.apache.thrift.meta_data.FieldMetaData("name",
                org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(
                    org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.UUID,
            new org.apache.thrift.meta_data.FieldMetaData("uuid",
                org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(
                    org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.STATE,
            new org.apache.thrift.meta_data.FieldMetaData("state",
                org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM,
                    DomainState.class)));
        tmpMap.put(_Fields.NUMBER_VIRT_CPU,
            new org.apache.thrift.meta_data.FieldMetaData("numberVirtCpu",
                org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(
                    org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.MEMORY,
            new org.apache.thrift.meta_data.FieldMetaData("memory",
                org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(
                    org.apache.thrift.protocol.TType.DOUBLE)));
        tmpMap.put(_Fields.XML_DESC,
            new org.apache.thrift.meta_data.FieldMetaData("xmlDesc",
                org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(
                    org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainInfo.class,
            metaDataMap);
    }

    public DomainInfo()
    {
    }

    public DomainInfo(String name, String uuid, DomainState state, int numberVirtCpu, double memory,
        String xmlDesc)
    {
        this();
        this.name = name;
        this.uuid = uuid;
        this.state = state;
        this.numberVirtCpu = numberVirtCpu;
        setNumberVirtCpuIsSet(true);
        this.memory = memory;
        setMemoryIsSet(true);
        this.xmlDesc = xmlDesc;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public DomainInfo(DomainInfo other)
    {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetName())
        {
            this.name = other.name;
        }
        if (other.isSetUuid())
        {
            this.uuid = other.uuid;
        }
        if (other.isSetState())
        {
            this.state = other.state;
        }
        this.numberVirtCpu = other.numberVirtCpu;
        this.memory = other.memory;
        if (other.isSetXmlDesc())
        {
            this.xmlDesc = other.xmlDesc;
        }
    }

    public DomainInfo deepCopy()
    {
        return new DomainInfo(this);
    }

    @Override
    public void clear()
    {
        this.name = null;
        this.uuid = null;
        this.state = null;
        setNumberVirtCpuIsSet(false);
        this.numberVirtCpu = 0;
        setMemoryIsSet(false);
        this.memory = 0.0;
        this.xmlDesc = null;
    }

    public String getName()
    {
        return this.name;
    }

    public DomainInfo setName(String name)
    {
        this.name = name;
        return this;
    }

    public void unsetName()
    {
        this.name = null;
    }

    /** Returns true if field name is set (has been assigned a value) and false otherwise */
    public boolean isSetName()
    {
        return this.name != null;
    }

    public void setNameIsSet(boolean value)
    {
        if (!value)
        {
            this.name = null;
        }
    }

    public String getUuid()
    {
        return this.uuid;
    }

    public DomainInfo setUuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    public void unsetUuid()
    {
        this.uuid = null;
    }

    /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
    public boolean isSetUuid()
    {
        return this.uuid != null;
    }

    public void setUuidIsSet(boolean value)
    {
        if (!value)
        {
            this.uuid = null;
        }
    }

    /**
     * @see DomainState
     */
    public DomainState getState()
    {
        return this.state;
    }

    /**
     * @see DomainState
     */
    public DomainInfo setState(DomainState state)
    {
        this.state = state;
        return this;
    }

    public void unsetState()
    {
        this.state = null;
    }

    /** Returns true if field state is set (has been assigned a value) and false otherwise */
    public boolean isSetState()
    {
        return this.state != null;
    }

    public void setStateIsSet(boolean value)
    {
        if (!value)
        {
            this.state = null;
        }
    }

    public int getNumberVirtCpu()
    {
        return this.numberVirtCpu;
    }

    public DomainInfo setNumberVirtCpu(int numberVirtCpu)
    {
        this.numberVirtCpu = numberVirtCpu;
        setNumberVirtCpuIsSet(true);
        return this;
    }

    public void unsetNumberVirtCpu()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMBERVIRTCPU_ISSET_ID);
    }

    /** Returns true if field numberVirtCpu is set (has been assigned a value) and false otherwise */
    public boolean isSetNumberVirtCpu()
    {
        return EncodingUtils.testBit(__isset_bitfield, __NUMBERVIRTCPU_ISSET_ID);
    }

    public void setNumberVirtCpuIsSet(boolean value)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMBERVIRTCPU_ISSET_ID, value);
    }

    public double getMemory()
    {
        return this.memory;
    }

    public DomainInfo setMemory(double memory)
    {
        this.memory = memory;
        setMemoryIsSet(true);
        return this;
    }

    public void unsetMemory()
    {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEMORY_ISSET_ID);
    }

    /** Returns true if field memory is set (has been assigned a value) and false otherwise */
    public boolean isSetMemory()
    {
        return EncodingUtils.testBit(__isset_bitfield, __MEMORY_ISSET_ID);
    }

    public void setMemoryIsSet(boolean value)
    {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEMORY_ISSET_ID, value);
    }

    public String getXmlDesc()
    {
        return this.xmlDesc;
    }

    public DomainInfo setXmlDesc(String xmlDesc)
    {
        this.xmlDesc = xmlDesc;
        return this;
    }

    public void unsetXmlDesc()
    {
        this.xmlDesc = null;
    }

    /** Returns true if field xmlDesc is set (has been assigned a value) and false otherwise */
    public boolean isSetXmlDesc()
    {
        return this.xmlDesc != null;
    }

    public void setXmlDescIsSet(boolean value)
    {
        if (!value)
        {
            this.xmlDesc = null;
        }
    }

    public void setFieldValue(_Fields field, Object value)
    {
        switch (field)
        {
            case NAME:
                if (value == null)
                {
                    unsetName();
                }
                else
                {
                    setName((String) value);
                }
                break;

            case UUID:
                if (value == null)
                {
                    unsetUuid();
                }
                else
                {
                    setUuid((String) value);
                }
                break;

            case STATE:
                if (value == null)
                {
                    unsetState();
                }
                else
                {
                    setState((DomainState) value);
                }
                break;

            case NUMBER_VIRT_CPU:
                if (value == null)
                {
                    unsetNumberVirtCpu();
                }
                else
                {
                    setNumberVirtCpu((Integer) value);
                }
                break;

            case MEMORY:
                if (value == null)
                {
                    unsetMemory();
                }
                else
                {
                    setMemory((Double) value);
                }
                break;

            case XML_DESC:
                if (value == null)
                {
                    unsetXmlDesc();
                }
                else
                {
                    setXmlDesc((String) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field)
    {
        switch (field)
        {
            case NAME:
                return getName();

            case UUID:
                return getUuid();

            case STATE:
                return getState();

            case NUMBER_VIRT_CPU:
                return Integer.valueOf(getNumberVirtCpu());

            case MEMORY:
                return Double.valueOf(getMemory());

            case XML_DESC:
                return getXmlDesc();

        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field)
    {
        if (field == null)
        {
            throw new IllegalArgumentException();
        }

        switch (field)
        {
            case NAME:
                return isSetName();
            case UUID:
                return isSetUuid();
            case STATE:
                return isSetState();
            case NUMBER_VIRT_CPU:
                return isSetNumberVirtCpu();
            case MEMORY:
                return isSetMemory();
            case XML_DESC:
                return isSetXmlDesc();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that)
    {
        if (that == null)
            return false;
        if (that instanceof DomainInfo)
            return this.equals((DomainInfo) that);
        return false;
    }

    public boolean equals(DomainInfo that)
    {
        if (that == null)
            return false;

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name)
        {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_uuid = true && this.isSetUuid();
        boolean that_present_uuid = true && that.isSetUuid();
        if (this_present_uuid || that_present_uuid)
        {
            if (!(this_present_uuid && that_present_uuid))
                return false;
            if (!this.uuid.equals(that.uuid))
                return false;
        }

        boolean this_present_state = true && this.isSetState();
        boolean that_present_state = true && that.isSetState();
        if (this_present_state || that_present_state)
        {
            if (!(this_present_state && that_present_state))
                return false;
            if (!this.state.equals(that.state))
                return false;
        }

        boolean this_present_numberVirtCpu = true;
        boolean that_present_numberVirtCpu = true;
        if (this_present_numberVirtCpu || that_present_numberVirtCpu)
        {
            if (!(this_present_numberVirtCpu && that_present_numberVirtCpu))
                return false;
            if (this.numberVirtCpu != that.numberVirtCpu)
                return false;
        }

        boolean this_present_memory = true;
        boolean that_present_memory = true;
        if (this_present_memory || that_present_memory)
        {
            if (!(this_present_memory && that_present_memory))
                return false;
            if (this.memory != that.memory)
                return false;
        }

        boolean this_present_xmlDesc = true && this.isSetXmlDesc();
        boolean that_present_xmlDesc = true && that.isSetXmlDesc();
        if (this_present_xmlDesc || that_present_xmlDesc)
        {
            if (!(this_present_xmlDesc && that_present_xmlDesc))
                return false;
            if (!this.xmlDesc.equals(that.xmlDesc))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        List<Object> list = new ArrayList<Object>();

        boolean present_name = true && (isSetName());
        list.add(present_name);
        if (present_name)
            list.add(name);

        boolean present_uuid = true && (isSetUuid());
        list.add(present_uuid);
        if (present_uuid)
            list.add(uuid);

        boolean present_state = true && (isSetState());
        list.add(present_state);
        if (present_state)
            list.add(state.getValue());

        boolean present_numberVirtCpu = true;
        list.add(present_numberVirtCpu);
        if (present_numberVirtCpu)
            list.add(numberVirtCpu);

        boolean present_memory = true;
        list.add(present_memory);
        if (present_memory)
            list.add(memory);

        boolean present_xmlDesc = true && (isSetXmlDesc());
        list.add(present_xmlDesc);
        if (present_xmlDesc)
            list.add(xmlDesc);

        return list.hashCode();
    }

    @Override
    public int compareTo(DomainInfo other)
    {
        if (!getClass().equals(other.getClass()))
        {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetName())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetUuid())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetState())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison =
            Boolean.valueOf(isSetNumberVirtCpu()).compareTo(other.isSetNumberVirtCpu());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetNumberVirtCpu())
        {
            lastComparison =
                org.apache.thrift.TBaseHelper.compareTo(this.numberVirtCpu, other.numberVirtCpu);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetMemory()).compareTo(other.isSetMemory());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetMemory())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memory, other.memory);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetXmlDesc()).compareTo(other.isSetXmlDesc());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        if (isSetXmlDesc())
        {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.xmlDesc, other.xmlDesc);
            if (lastComparison != 0)
            {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId)
    {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException
    {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot)
        throws org.apache.thrift.TException
    {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("DomainInfo(");
        boolean first = true;

        sb.append("name:");
        if (this.name == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.name);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("uuid:");
        if (this.uuid == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.uuid);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("state:");
        if (this.state == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.state);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("numberVirtCpu:");
        sb.append(this.numberVirtCpu);
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("memory:");
        sb.append(this.memory);
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("xmlDesc:");
        if (this.xmlDesc == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.xmlDesc);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException
    {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        try
        {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                new org.apache.thrift.transport.TIOStreamTransport(out)));
        }
        catch (org.apache.thrift.TException te)
        {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in)
        throws java.io.IOException, ClassNotFoundException
    {
        try
        {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(
                new org.apache.thrift.transport.TIOStreamTransport(in)));
        }
        catch (org.apache.thrift.TException te)
        {
            throw new java.io.IOException(te);
        }
    }

    private static class DomainInfoStandardSchemeFactory implements SchemeFactory
    {
        public DomainInfoStandardScheme getScheme()
        {
            return new DomainInfoStandardScheme();
        }
    }

    private static class DomainInfoStandardScheme extends StandardScheme<DomainInfo>
    {

        public void read(org.apache.thrift.protocol.TProtocol iprot, DomainInfo struct)
            throws org.apache.thrift.TException
        {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true)
            {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP)
                {
                    break;
                }
                switch (schemeField.id)
                {
                    case 1: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING)
                        {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        }
                        else
                        {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // UUID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING)
                        {
                            struct.uuid = iprot.readString();
                            struct.setUuidIsSet(true);
                        }
                        else
                        {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // STATE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32)
                        {
                            struct.state =
                                com.abiquo.aimstub.DomainState.findByValue(iprot.readI32());
                            struct.setStateIsSet(true);
                        }
                        else
                        {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // NUMBER_VIRT_CPU
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32)
                        {
                            struct.numberVirtCpu = iprot.readI32();
                            struct.setNumberVirtCpuIsSet(true);
                        }
                        else
                        {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // MEMORY
                        if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE)
                        {
                            struct.memory = iprot.readDouble();
                            struct.setMemoryIsSet(true);
                        }
                        else
                        {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 6: // XML_DESC
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING)
                        {
                            struct.xmlDesc = iprot.readString();
                            struct.setXmlDescIsSet(true);
                        }
                        else
                        {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, DomainInfo struct)
            throws org.apache.thrift.TException
        {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.name != null)
            {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.uuid != null)
            {
                oprot.writeFieldBegin(UUID_FIELD_DESC);
                oprot.writeString(struct.uuid);
                oprot.writeFieldEnd();
            }
            if (struct.state != null)
            {
                oprot.writeFieldBegin(STATE_FIELD_DESC);
                oprot.writeI32(struct.state.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(NUMBER_VIRT_CPU_FIELD_DESC);
            oprot.writeI32(struct.numberVirtCpu);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MEMORY_FIELD_DESC);
            oprot.writeDouble(struct.memory);
            oprot.writeFieldEnd();
            if (struct.xmlDesc != null)
            {
                oprot.writeFieldBegin(XML_DESC_FIELD_DESC);
                oprot.writeString(struct.xmlDesc);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class DomainInfoTupleSchemeFactory implements SchemeFactory
    {
        public DomainInfoTupleScheme getScheme()
        {
            return new DomainInfoTupleScheme();
        }
    }

    private static class DomainInfoTupleScheme extends TupleScheme<DomainInfo>
    {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, DomainInfo struct)
            throws org.apache.thrift.TException
        {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetName())
            {
                optionals.set(0);
            }
            if (struct.isSetUuid())
            {
                optionals.set(1);
            }
            if (struct.isSetState())
            {
                optionals.set(2);
            }
            if (struct.isSetNumberVirtCpu())
            {
                optionals.set(3);
            }
            if (struct.isSetMemory())
            {
                optionals.set(4);
            }
            if (struct.isSetXmlDesc())
            {
                optionals.set(5);
            }
            oprot.writeBitSet(optionals, 6);
            if (struct.isSetName())
            {
                oprot.writeString(struct.name);
            }
            if (struct.isSetUuid())
            {
                oprot.writeString(struct.uuid);
            }
            if (struct.isSetState())
            {
                oprot.writeI32(struct.state.getValue());
            }
            if (struct.isSetNumberVirtCpu())
            {
                oprot.writeI32(struct.numberVirtCpu);
            }
            if (struct.isSetMemory())
            {
                oprot.writeDouble(struct.memory);
            }
            if (struct.isSetXmlDesc())
            {
                oprot.writeString(struct.xmlDesc);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, DomainInfo struct)
            throws org.apache.thrift.TException
        {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(6);
            if (incoming.get(0))
            {
                struct.name = iprot.readString();
                struct.setNameIsSet(true);
            }
            if (incoming.get(1))
            {
                struct.uuid = iprot.readString();
                struct.setUuidIsSet(true);
            }
            if (incoming.get(2))
            {
                struct.state = com.abiquo.aimstub.DomainState.findByValue(iprot.readI32());
                struct.setStateIsSet(true);
            }
            if (incoming.get(3))
            {
                struct.numberVirtCpu = iprot.readI32();
                struct.setNumberVirtCpuIsSet(true);
            }
            if (incoming.get(4))
            {
                struct.memory = iprot.readDouble();
                struct.setMemoryIsSet(true);
            }
            if (incoming.get(5))
            {
                struct.xmlDesc = iprot.readString();
                struct.setXmlDescIsSet(true);
            }
        }
    }

}
