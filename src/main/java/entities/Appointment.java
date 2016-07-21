package entities;

import java.time.LocalDate;

/**
 * Created by Justin on 7/21/16.
 */
public class Appointment {
    public static enum AptType {GROOM, CHECKUP, SURGERY}


    private Long AppointmentId;
    private Long ownerId;
    private Long petId;
    private LocalDate aptDate;
    private AptType aptType;

    //constructors

    public Appointment(Long AppointmentId, Long ownerId, Long petId, LocalDate aptDate, AptType aptType) {

    }

    public Appointment(Long appointmentId, LocalDate of, AptType surgery, Long ownerId, Long petId) {

    }

    //getters and setters

    public Long getAppointmentId() {

        return AppointmentId;
    }

    public void setAppointmentId(Long appointmentId) {

        this.AppointmentId = appointmentId;
    }

    public Long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(Long ownerId) {

        this.ownerId = ownerId;
    }

    public Long getPetId() {

        return petId;
    }

    public void setPetId(Long petId) {

        this.petId = petId;
    }

    public LocalDate getAptDate() {

        return aptDate;
    }

    public void setAptDate(LocalDate aptDate) {

        this.aptDate = aptDate;
    }

    public AptType getAptType() {

        return aptType;
    }

    public void setAptType(AptType aptType) {

        this.aptType = aptType;
    }
}

