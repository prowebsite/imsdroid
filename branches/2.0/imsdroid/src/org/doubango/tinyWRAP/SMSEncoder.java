/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class SMSEncoder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SMSEncoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SMSEncoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_SMSEncoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static RPMessage encodeSubmit(int mr, String smsc, String destination, String ascii) {
    long cPtr = tinyWRAPJNI.SMSEncoder_encodeSubmit(mr, smsc, destination, ascii);
    return (cPtr == 0) ? null : new RPMessage(cPtr, true);
  }

  public static RPMessage encodeDeliver(int mr, String smsc, String originator, String ascii) {
    long cPtr = tinyWRAPJNI.SMSEncoder_encodeDeliver(mr, smsc, originator, ascii);
    return (cPtr == 0) ? null : new RPMessage(cPtr, true);
  }

  public static RPMessage encodeACK(int mr, String smsc, String destination, boolean forSUBMIT) {
    long cPtr = tinyWRAPJNI.SMSEncoder_encodeACK(mr, smsc, destination, forSUBMIT);
    return (cPtr == 0) ? null : new RPMessage(cPtr, true);
  }

  public static RPMessage encodeError(int mr, String smsc, String destination, boolean forSUBMIT) {
    long cPtr = tinyWRAPJNI.SMSEncoder_encodeError(mr, smsc, destination, forSUBMIT);
    return (cPtr == 0) ? null : new RPMessage(cPtr, true);
  }

  public static SMSData decode(java.nio.ByteBuffer data, long size, boolean MobOrig) {
    long cPtr = tinyWRAPJNI.SMSEncoder_decode(data, size, MobOrig);
    return (cPtr == 0) ? null : new SMSData(cPtr, true);
  }

}
