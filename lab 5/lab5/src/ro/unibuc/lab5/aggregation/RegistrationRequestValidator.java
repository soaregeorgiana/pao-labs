package ro.unibuc.lab5.aggregation;

public class RegistrationRequestValidator {

    private String[] allowedCities = {"Bucuresti", "Iasi", "Ploiesti"};

    public void validate(RegistrationRequest registrationRequest) {
        if (validateName(registrationRequest.getFirstName())
                && validateNameWithRegex(registrationRequest.getLastName())
                && validateEmail(registrationRequest.getEmail())
                && validatePhoneUsingRegex(registrationRequest.getPhoneNumber())
                && validateAddress(registrationRequest.getAddress())) {
            System.out.println("Valid request!");
        } else {
            System.out.println("Invalid request");
        }
    }

    private boolean validateName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            return false;
        }
        return Character.isUpperCase(name.charAt(0));
    }

    private boolean validateNameWithRegex(String name) {
        return name.matches("[A-Z][a-z]+");
    }

    private boolean validateEmail(String email) {
        return email.matches("^(.+)@(.+)$");
    }

    private boolean validatePhone(String phone) {
        if (phone.length() == 10 && phone.startsWith("07")) {
            for (int i = 0; i < phone.length(); i++) {
                if (!Character.isDigit(phone.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean validatePhoneUsingRegex(String phone) {
        return phone.matches("(07)[0-9]{8}");
    }

    private boolean validateAddress(Address address) {
        boolean exists = false;
        for (String city : allowedCities) {
            if (city.equalsIgnoreCase(address.getCity())) {
                exists = true;
            }
        }
        return exists;
    }

}
