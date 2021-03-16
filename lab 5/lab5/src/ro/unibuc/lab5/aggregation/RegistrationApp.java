package ro.unibuc.lab5.aggregation;

public class RegistrationApp {

    public static void main(String[] args) {

        RegistrationRequestValidator validator = new RegistrationRequestValidator();

        Address address = new Address("Romania", "Iasi", "A.I.Cuza", 100, 34);
        RegistrationRequest formOne = new RegistrationRequest("Ana", "Pop", "email@valid", "07878789809", address);
        RegistrationRequest formTwo = new RegistrationRequest("Ion", "Pop", "@valid", "0787878999", address);
        RegistrationRequest formThree = new RegistrationRequest("Maria", "Pop", "email@v", "0787878976", address);

        RegistrationRequest[] initiatedRequests = {formOne, formTwo, formThree};
        for (RegistrationRequest request : initiatedRequests) {
            validator.validate(request);
        }
    }
}
