package ProfissionaisDaSaude.DataProvider.Models;

public class UserModel {

    String email, name, surname, cpf, birthdate, communicationChannel, phoneNumber, registerType, registerNumber, uf, specialty;

    public UserModel(String email, String name, String surname, String cpf, String birthdate, String communicationChannel, String phoneNumber, String registerType, String registerNumber, String uf, String specialty) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.birthdate = birthdate;
        this.communicationChannel = communicationChannel;
        this.phoneNumber = phoneNumber;
        this.registerType = registerType;
        this.registerNumber = registerNumber;
        this.specialty = specialty;
        this.uf = uf;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCommunicationChannel() {
        return communicationChannel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRegisterType() {
        return registerType;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public String getUf() {
        return uf;
    }

    public String getSpecialty() { return this.specialty; }

}
