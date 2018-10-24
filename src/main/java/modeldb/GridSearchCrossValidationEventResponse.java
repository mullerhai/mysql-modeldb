/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package modeldb;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-08-01")
public class GridSearchCrossValidationEventResponse implements org.apache.thrift.TBase<GridSearchCrossValidationEventResponse, GridSearchCrossValidationEventResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GridSearchCrossValidationEventResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GridSearchCrossValidationEventResponse");

  private static final org.apache.thrift.protocol.TField GSCVE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gscveId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EVENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("eventId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FIT_EVENT_RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("fitEventResponse", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField CROSS_VALIDATION_EVENT_RESPONSES_FIELD_DESC = new org.apache.thrift.protocol.TField("crossValidationEventResponses", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GridSearchCrossValidationEventResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GridSearchCrossValidationEventResponseTupleSchemeFactory());
  }

  public int gscveId; // required
  public int eventId; // required
  public FitEventResponse fitEventResponse; // required
  public List<CrossValidationEventResponse> crossValidationEventResponses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GSCVE_ID((short)1, "gscveId"),
    EVENT_ID((short)2, "eventId"),
    FIT_EVENT_RESPONSE((short)3, "fitEventResponse"),
    CROSS_VALIDATION_EVENT_RESPONSES((short)4, "crossValidationEventResponses");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GSCVE_ID
          return GSCVE_ID;
        case 2: // EVENT_ID
          return EVENT_ID;
        case 3: // FIT_EVENT_RESPONSE
          return FIT_EVENT_RESPONSE;
        case 4: // CROSS_VALIDATION_EVENT_RESPONSES
          return CROSS_VALIDATION_EVENT_RESPONSES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GSCVEID_ISSET_ID = 0;
  private static final int __EVENTID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GSCVE_ID, new org.apache.thrift.meta_data.FieldMetaData("gscveId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EVENT_ID, new org.apache.thrift.meta_data.FieldMetaData("eventId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FIT_EVENT_RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("fitEventResponse", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FitEventResponse.class)));
    tmpMap.put(_Fields.CROSS_VALIDATION_EVENT_RESPONSES, new org.apache.thrift.meta_data.FieldMetaData("crossValidationEventResponses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CrossValidationEventResponse.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GridSearchCrossValidationEventResponse.class, metaDataMap);
  }

  public GridSearchCrossValidationEventResponse() {
  }

  public GridSearchCrossValidationEventResponse(
    int gscveId,
    int eventId,
    FitEventResponse fitEventResponse,
    List<CrossValidationEventResponse> crossValidationEventResponses)
  {
    this();
    this.gscveId = gscveId;
    setGscveIdIsSet(true);
    this.eventId = eventId;
    setEventIdIsSet(true);
    this.fitEventResponse = fitEventResponse;
    this.crossValidationEventResponses = crossValidationEventResponses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GridSearchCrossValidationEventResponse(GridSearchCrossValidationEventResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.gscveId = other.gscveId;
    this.eventId = other.eventId;
    if (other.isSetFitEventResponse()) {
      this.fitEventResponse = new FitEventResponse(other.fitEventResponse);
    }
    if (other.isSetCrossValidationEventResponses()) {
      List<CrossValidationEventResponse> __this__crossValidationEventResponses = new ArrayList<CrossValidationEventResponse>(other.crossValidationEventResponses.size());
      for (CrossValidationEventResponse other_element : other.crossValidationEventResponses) {
        __this__crossValidationEventResponses.add(new CrossValidationEventResponse(other_element));
      }
      this.crossValidationEventResponses = __this__crossValidationEventResponses;
    }
  }

  public GridSearchCrossValidationEventResponse deepCopy() {
    return new GridSearchCrossValidationEventResponse(this);
  }

  @Override
  public void clear() {
    setGscveIdIsSet(false);
    this.gscveId = 0;
    setEventIdIsSet(false);
    this.eventId = 0;
    this.fitEventResponse = null;
    this.crossValidationEventResponses = null;
  }

  public int getGscveId() {
    return this.gscveId;
  }

  public GridSearchCrossValidationEventResponse setGscveId(int gscveId) {
    this.gscveId = gscveId;
    setGscveIdIsSet(true);
    return this;
  }

  public void unsetGscveId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GSCVEID_ISSET_ID);
  }

  /** Returns true if field gscveId is set (has been assigned a value) and false otherwise */
  public boolean isSetGscveId() {
    return EncodingUtils.testBit(__isset_bitfield, __GSCVEID_ISSET_ID);
  }

  public void setGscveIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GSCVEID_ISSET_ID, value);
  }

  public int getEventId() {
    return this.eventId;
  }

  public GridSearchCrossValidationEventResponse setEventId(int eventId) {
    this.eventId = eventId;
    setEventIdIsSet(true);
    return this;
  }

  public void unsetEventId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EVENTID_ISSET_ID);
  }

  /** Returns true if field eventId is set (has been assigned a value) and false otherwise */
  public boolean isSetEventId() {
    return EncodingUtils.testBit(__isset_bitfield, __EVENTID_ISSET_ID);
  }

  public void setEventIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EVENTID_ISSET_ID, value);
  }

  public FitEventResponse getFitEventResponse() {
    return this.fitEventResponse;
  }

  public GridSearchCrossValidationEventResponse setFitEventResponse(FitEventResponse fitEventResponse) {
    this.fitEventResponse = fitEventResponse;
    return this;
  }

  public void unsetFitEventResponse() {
    this.fitEventResponse = null;
  }

  /** Returns true if field fitEventResponse is set (has been assigned a value) and false otherwise */
  public boolean isSetFitEventResponse() {
    return this.fitEventResponse != null;
  }

  public void setFitEventResponseIsSet(boolean value) {
    if (!value) {
      this.fitEventResponse = null;
    }
  }

  public int getCrossValidationEventResponsesSize() {
    return (this.crossValidationEventResponses == null) ? 0 : this.crossValidationEventResponses.size();
  }

  public java.util.Iterator<CrossValidationEventResponse> getCrossValidationEventResponsesIterator() {
    return (this.crossValidationEventResponses == null) ? null : this.crossValidationEventResponses.iterator();
  }

  public void addToCrossValidationEventResponses(CrossValidationEventResponse elem) {
    if (this.crossValidationEventResponses == null) {
      this.crossValidationEventResponses = new ArrayList<CrossValidationEventResponse>();
    }
    this.crossValidationEventResponses.add(elem);
  }

  public List<CrossValidationEventResponse> getCrossValidationEventResponses() {
    return this.crossValidationEventResponses;
  }

  public GridSearchCrossValidationEventResponse setCrossValidationEventResponses(List<CrossValidationEventResponse> crossValidationEventResponses) {
    this.crossValidationEventResponses = crossValidationEventResponses;
    return this;
  }

  public void unsetCrossValidationEventResponses() {
    this.crossValidationEventResponses = null;
  }

  /** Returns true if field crossValidationEventResponses is set (has been assigned a value) and false otherwise */
  public boolean isSetCrossValidationEventResponses() {
    return this.crossValidationEventResponses != null;
  }

  public void setCrossValidationEventResponsesIsSet(boolean value) {
    if (!value) {
      this.crossValidationEventResponses = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GSCVE_ID:
      if (value == null) {
        unsetGscveId();
      } else {
        setGscveId((Integer)value);
      }
      break;

    case EVENT_ID:
      if (value == null) {
        unsetEventId();
      } else {
        setEventId((Integer)value);
      }
      break;

    case FIT_EVENT_RESPONSE:
      if (value == null) {
        unsetFitEventResponse();
      } else {
        setFitEventResponse((FitEventResponse)value);
      }
      break;

    case CROSS_VALIDATION_EVENT_RESPONSES:
      if (value == null) {
        unsetCrossValidationEventResponses();
      } else {
        setCrossValidationEventResponses((List<CrossValidationEventResponse>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GSCVE_ID:
      return getGscveId();

    case EVENT_ID:
      return getEventId();

    case FIT_EVENT_RESPONSE:
      return getFitEventResponse();

    case CROSS_VALIDATION_EVENT_RESPONSES:
      return getCrossValidationEventResponses();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GSCVE_ID:
      return isSetGscveId();
    case EVENT_ID:
      return isSetEventId();
    case FIT_EVENT_RESPONSE:
      return isSetFitEventResponse();
    case CROSS_VALIDATION_EVENT_RESPONSES:
      return isSetCrossValidationEventResponses();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GridSearchCrossValidationEventResponse)
      return this.equals((GridSearchCrossValidationEventResponse)that);
    return false;
  }

  public boolean equals(GridSearchCrossValidationEventResponse that) {
    if (that == null)
      return false;

    boolean this_present_gscveId = true;
    boolean that_present_gscveId = true;
    if (this_present_gscveId || that_present_gscveId) {
      if (!(this_present_gscveId && that_present_gscveId))
        return false;
      if (this.gscveId != that.gscveId)
        return false;
    }

    boolean this_present_eventId = true;
    boolean that_present_eventId = true;
    if (this_present_eventId || that_present_eventId) {
      if (!(this_present_eventId && that_present_eventId))
        return false;
      if (this.eventId != that.eventId)
        return false;
    }

    boolean this_present_fitEventResponse = true && this.isSetFitEventResponse();
    boolean that_present_fitEventResponse = true && that.isSetFitEventResponse();
    if (this_present_fitEventResponse || that_present_fitEventResponse) {
      if (!(this_present_fitEventResponse && that_present_fitEventResponse))
        return false;
      if (!this.fitEventResponse.equals(that.fitEventResponse))
        return false;
    }

    boolean this_present_crossValidationEventResponses = true && this.isSetCrossValidationEventResponses();
    boolean that_present_crossValidationEventResponses = true && that.isSetCrossValidationEventResponses();
    if (this_present_crossValidationEventResponses || that_present_crossValidationEventResponses) {
      if (!(this_present_crossValidationEventResponses && that_present_crossValidationEventResponses))
        return false;
      if (!this.crossValidationEventResponses.equals(that.crossValidationEventResponses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_gscveId = true;
    list.add(present_gscveId);
    if (present_gscveId)
      list.add(gscveId);

    boolean present_eventId = true;
    list.add(present_eventId);
    if (present_eventId)
      list.add(eventId);

    boolean present_fitEventResponse = true && (isSetFitEventResponse());
    list.add(present_fitEventResponse);
    if (present_fitEventResponse)
      list.add(fitEventResponse);

    boolean present_crossValidationEventResponses = true && (isSetCrossValidationEventResponses());
    list.add(present_crossValidationEventResponses);
    if (present_crossValidationEventResponses)
      list.add(crossValidationEventResponses);

    return list.hashCode();
  }

  @Override
  public int compareTo(GridSearchCrossValidationEventResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGscveId()).compareTo(other.isSetGscveId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGscveId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gscveId, other.gscveId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEventId()).compareTo(other.isSetEventId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventId, other.eventId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFitEventResponse()).compareTo(other.isSetFitEventResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFitEventResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fitEventResponse, other.fitEventResponse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCrossValidationEventResponses()).compareTo(other.isSetCrossValidationEventResponses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrossValidationEventResponses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crossValidationEventResponses, other.crossValidationEventResponses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GridSearchCrossValidationEventResponse(");
    boolean first = true;

    sb.append("gscveId:");
    sb.append(this.gscveId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventId:");
    sb.append(this.eventId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fitEventResponse:");
    if (this.fitEventResponse == null) {
      sb.append("null");
    } else {
      sb.append(this.fitEventResponse);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("crossValidationEventResponses:");
    if (this.crossValidationEventResponses == null) {
      sb.append("null");
    } else {
      sb.append(this.crossValidationEventResponses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (fitEventResponse != null) {
      fitEventResponse.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GridSearchCrossValidationEventResponseStandardSchemeFactory implements SchemeFactory {
    public GridSearchCrossValidationEventResponseStandardScheme getScheme() {
      return new GridSearchCrossValidationEventResponseStandardScheme();
    }
  }

  private static class GridSearchCrossValidationEventResponseStandardScheme extends StandardScheme<GridSearchCrossValidationEventResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GridSearchCrossValidationEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GSCVE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.gscveId = iprot.readI32();
              struct.setGscveIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.eventId = iprot.readI32();
              struct.setEventIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIT_EVENT_RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fitEventResponse = new FitEventResponse();
              struct.fitEventResponse.read(iprot);
              struct.setFitEventResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CROSS_VALIDATION_EVENT_RESPONSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list338 = iprot.readListBegin();
                struct.crossValidationEventResponses = new ArrayList<CrossValidationEventResponse>(_list338.size);
                CrossValidationEventResponse _elem339;
                for (int _i340 = 0; _i340 < _list338.size; ++_i340)
                {
                  _elem339 = new CrossValidationEventResponse();
                  _elem339.read(iprot);
                  struct.crossValidationEventResponses.add(_elem339);
                }
                iprot.readListEnd();
              }
              struct.setCrossValidationEventResponsesIsSet(true);
            } else { 
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GridSearchCrossValidationEventResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GSCVE_ID_FIELD_DESC);
      oprot.writeI32(struct.gscveId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EVENT_ID_FIELD_DESC);
      oprot.writeI32(struct.eventId);
      oprot.writeFieldEnd();
      if (struct.fitEventResponse != null) {
        oprot.writeFieldBegin(FIT_EVENT_RESPONSE_FIELD_DESC);
        struct.fitEventResponse.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.crossValidationEventResponses != null) {
        oprot.writeFieldBegin(CROSS_VALIDATION_EVENT_RESPONSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.crossValidationEventResponses.size()));
          for (CrossValidationEventResponse _iter341 : struct.crossValidationEventResponses)
          {
            _iter341.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GridSearchCrossValidationEventResponseTupleSchemeFactory implements SchemeFactory {
    public GridSearchCrossValidationEventResponseTupleScheme getScheme() {
      return new GridSearchCrossValidationEventResponseTupleScheme();
    }
  }

  private static class GridSearchCrossValidationEventResponseTupleScheme extends TupleScheme<GridSearchCrossValidationEventResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GridSearchCrossValidationEventResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGscveId()) {
        optionals.set(0);
      }
      if (struct.isSetEventId()) {
        optionals.set(1);
      }
      if (struct.isSetFitEventResponse()) {
        optionals.set(2);
      }
      if (struct.isSetCrossValidationEventResponses()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetGscveId()) {
        oprot.writeI32(struct.gscveId);
      }
      if (struct.isSetEventId()) {
        oprot.writeI32(struct.eventId);
      }
      if (struct.isSetFitEventResponse()) {
        struct.fitEventResponse.write(oprot);
      }
      if (struct.isSetCrossValidationEventResponses()) {
        {
          oprot.writeI32(struct.crossValidationEventResponses.size());
          for (CrossValidationEventResponse _iter342 : struct.crossValidationEventResponses)
          {
            _iter342.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GridSearchCrossValidationEventResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.gscveId = iprot.readI32();
        struct.setGscveIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.eventId = iprot.readI32();
        struct.setEventIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.fitEventResponse = new FitEventResponse();
        struct.fitEventResponse.read(iprot);
        struct.setFitEventResponseIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list343 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.crossValidationEventResponses = new ArrayList<CrossValidationEventResponse>(_list343.size);
          CrossValidationEventResponse _elem344;
          for (int _i345 = 0; _i345 < _list343.size; ++_i345)
          {
            _elem344 = new CrossValidationEventResponse();
            _elem344.read(iprot);
            struct.crossValidationEventResponses.add(_elem344);
          }
        }
        struct.setCrossValidationEventResponsesIsSet(true);
      }
    }
  }

}
