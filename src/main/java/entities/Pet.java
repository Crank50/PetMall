package entities;

import java.time.LocalDate;

/**
 * Created by Justin on 7/21/16.
 */
public class Pet {
    public static enum PetType { DOG, CAT, FISH, BIRD };
    private String name;
    private LocalDate dob;
    private PetType petType;
    private Long petId;
    private Long ownerId;

    //constructors

    public Pet(Long petId, String kat, LocalDate of, PetType cat, Long ownerId) {

    }
    public Pet(String name, LocalDate dob, PetType petType, Long petId, Long ownerId) {

    }


//getters and setters

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public LocalDate getDob() {

        return dob;
    }

    public void setDob(LocalDate dob) {

        this.dob = dob;
    }

    public PetType getPetType() {

        return petType;
    }

    public void setPetType(PetType petType) {

        this.petType = petType;
    }

    public Long getPetId() {

        return petId;
    }

    public void setPetId(Long petId) {

        this.petId = petId;
    }

    public Long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(Long ownerId) {

        this.ownerId = ownerId;
    }

}
