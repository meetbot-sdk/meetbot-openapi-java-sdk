package com.meetbot.openapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Meta contacts 消息中的联系人。
 *
 * @see <a href="https://developers.facebook.com/documentation/business-messaging/whatsapp/messages/send-messages">Send messages</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhatsappContactObject extends ExtensibleDto {

    private WhatsappContactName name;
    private String birthday;
    private WhatsappContactOrg org;
    private List<WhatsappContactPhone> phones;
    private List<WhatsappContactEmail> emails;
    private List<WhatsappContactUrl> urls;
    private List<WhatsappContactAddress> addresses;

    public WhatsappContactName getName() {
        return name;
    }

    public void setName(WhatsappContactName name) {
        this.name = name;
    }

    public WhatsappContactObject name(WhatsappContactName name) {
        this.name = name;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public WhatsappContactObject birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public WhatsappContactOrg getOrg() {
        return org;
    }

    public void setOrg(WhatsappContactOrg org) {
        this.org = org;
    }

    public WhatsappContactObject org(WhatsappContactOrg org) {
        this.org = org;
        return this;
    }

    public List<WhatsappContactPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<WhatsappContactPhone> phones) {
        this.phones = phones;
    }

    public WhatsappContactObject phones(List<WhatsappContactPhone> phones) {
        this.phones = phones;
        return this;
    }

    public List<WhatsappContactEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<WhatsappContactEmail> emails) {
        this.emails = emails;
    }

    public WhatsappContactObject emails(List<WhatsappContactEmail> emails) {
        this.emails = emails;
        return this;
    }

    public List<WhatsappContactUrl> getUrls() {
        return urls;
    }

    public void setUrls(List<WhatsappContactUrl> urls) {
        this.urls = urls;
    }

    public WhatsappContactObject urls(List<WhatsappContactUrl> urls) {
        this.urls = urls;
        return this;
    }

    public List<WhatsappContactAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<WhatsappContactAddress> addresses) {
        this.addresses = addresses;
    }

    public WhatsappContactObject addresses(List<WhatsappContactAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappContactName extends ExtensibleDto {
        @JsonProperty("formatted_name")
        private String formattedName;
        @JsonProperty("first_name")
        private String firstName;
        @JsonProperty("last_name")
        private String lastName;
        @JsonProperty("middle_name")
        private String middleName;
        private String suffix;
        private String prefix;

        public String getFormattedName() {
            return formattedName;
        }

        public void setFormattedName(String formattedName) {
            this.formattedName = formattedName;
        }

        public WhatsappContactName formattedName(String formattedName) {
            this.formattedName = formattedName;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public WhatsappContactName firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public WhatsappContactName lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public WhatsappContactName middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public String getSuffix() {
            return suffix;
        }

        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        public WhatsappContactName suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public WhatsappContactName prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappContactOrg extends ExtensibleDto {
        private String company;
        private String department;
        private String title;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public WhatsappContactOrg company(String company) {
            this.company = company;
            return this;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public WhatsappContactOrg department(String department) {
            this.department = department;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public WhatsappContactOrg title(String title) {
            this.title = title;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappContactPhone extends ExtensibleDto {
        private String phone;
        private String type;
        @JsonProperty("wa_id")
        private String waId;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public WhatsappContactPhone phone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public WhatsappContactPhone type(String type) {
            this.type = type;
            return this;
        }

        public String getWaId() {
            return waId;
        }

        public void setWaId(String waId) {
            this.waId = waId;
        }

        public WhatsappContactPhone waId(String waId) {
            this.waId = waId;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappContactEmail extends ExtensibleDto {
        private String email;
        private String type;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public WhatsappContactEmail email(String email) {
            this.email = email;
            return this;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public WhatsappContactEmail type(String type) {
            this.type = type;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappContactUrl extends ExtensibleDto {
        private String url;
        private String type;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public WhatsappContactUrl url(String url) {
            this.url = url;
            return this;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public WhatsappContactUrl type(String type) {
            this.type = type;
            return this;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WhatsappContactAddress extends ExtensibleDto {
        private String street;
        private String city;
        private String state;
        private String zip;
        private String country;
        @JsonProperty("country_code")
        private String countryCode;
        private String type;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public WhatsappContactAddress street(String street) {
            this.street = street;
            return this;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public WhatsappContactAddress city(String city) {
            this.city = city;
            return this;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public WhatsappContactAddress state(String state) {
            this.state = state;
            return this;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public WhatsappContactAddress zip(String zip) {
            this.zip = zip;
            return this;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public WhatsappContactAddress country(String country) {
            this.country = country;
            return this;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public WhatsappContactAddress countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public WhatsappContactAddress type(String type) {
            this.type = type;
            return this;
        }
    }
}
