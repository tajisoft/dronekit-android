/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HIL_ACTUATOR_CONTROLS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Sent from autopilot to simulation. Hardware in the loop control outputs (replacement for HIL_CONTROLS)
 */
public class msg_hil_actuator_controls extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS = 93;
    public static final int MAVLINK_MSG_LENGTH = 81;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
      
    /**
     * Flags as bitfield, 1: indicate simulation using lockstep.
     */
    public long flags;
      
    /**
     * Control outputs -1 .. 1. Channel assignment depends on the simulated hardware.
     */
    public float controls[] = new float[16];
      
    /**
     * System mode. Includes arming state.
     */
    public short mode;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putUnsignedLong(flags);
        
        for (int i = 0; i < controls.length; i++) {
            packet.payload.putFloat(controls[i]);
        }
                    
        packet.payload.putUnsignedByte(mode);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a hil_actuator_controls message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.flags = payload.getUnsignedLong();
         
        for (int i = 0; i < this.controls.length; i++) {
            this.controls[i] = payload.getFloat();
        }
                
        this.mode = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_hil_actuator_controls() {
        this.msgid = MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_hil_actuator_controls( long time_usec, long flags, float[] controls, short mode) {
        this.msgid = MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS;

        this.time_usec = time_usec;
        this.flags = flags;
        this.controls = controls;
        this.mode = mode;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_hil_actuator_controls( long time_usec, long flags, float[] controls, short mode, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.flags = flags;
        this.controls = controls;
        this.mode = mode;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_hil_actuator_controls(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

            
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" flags:"+flags+" controls:"+controls+" mode:"+mode+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_HIL_ACTUATOR_CONTROLS";
    }
}
        