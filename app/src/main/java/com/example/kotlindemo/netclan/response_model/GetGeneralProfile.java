package com.example.kotlindemo.netclan.response_model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "profile")
public class GetGeneralProfile {

    @ColumnInfo(name = "countryCode")
    @SerializedName("countryCode")
    @Expose
    private String countryCode;

    @Embedded(prefix = "bio_")
    @SerializedName("bio")
    @Expose
    private Bio bio;

    @Embedded(prefix = "places_")
    @SerializedName("places")
    @Expose
    private PlaceList placeList;

    @Embedded(prefix = "socialMedia_")
    @SerializedName("socialMedia")
    @Expose
    private SocialList socialList;

    @Embedded(prefix = "education_")
    @SerializedName("education")
    @Expose
    private EducationList educationList;

    @Embedded(prefix = "professional_")
    @SerializedName("professional")
    @Expose
    private ProfessionalList professionalList;

    @Embedded(prefix = "hobbies_")
    @SerializedName("hobbies")
    @Expose
    private PersonalPreferences hobbies;

    @Embedded(prefix = "movies_")
    @SerializedName("movies")
    @Expose
    private PersonalPreferences movies;

    @Embedded(prefix = "sports_")
    @SerializedName("sports")
    @Expose
    private PersonalPreferences sports;

    @Embedded(prefix = "foodPreferences_")
    @SerializedName("foodPreferences")
    @Expose
    private PersonalPreferences foodPreferences;

    @Embedded(prefix = "otherPreferences_")
    @SerializedName("otherPreferences")
    @Expose
    private PersonalPreferences otherPreferences;

    @Embedded(prefix = "emergencyDetails_")
    @SerializedName("emergencyDetails")
    @Expose
    private EmergencyDetails emergencyDetails;

    @Embedded(prefix = "email_")
    @SerializedName("email")
    @Expose
    private DataObject email;

    @Embedded(prefix = "officeEmail_")
    @SerializedName("officeEmail")
    @Expose
    private DataObject officeEmail;

    @Embedded(prefix = "alternateEmail_")
    @SerializedName("alternateEmail")
    @Expose
    private DataObject alternateEmail;

    @Embedded(prefix = "officePhone_")
    @SerializedName("officePhone")
    @Expose
    private DataObject officePhone;

    @Embedded(prefix = "alternatePhone_")
    @SerializedName("alternatePhone")
    @Expose
    private DataObject alternatePhone;

    @Embedded(prefix = "location_")
    @SerializedName("location")
    @Expose
    private Location location;

    @Embedded(prefix = "startup_")
    @SerializedName("startup")
    @Expose
    private Startup startup;

    @ColumnInfo(name = "isVerified")
    @SerializedName("isVerified")
    @Expose
    private Integer isVerified;

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "_id")
    @SerializedName("_id")
    @Expose
    private String id;

    @ColumnInfo(name = "netClanId")
    @SerializedName("netClanId")
    @Expose
    private String netclanId;

    @ColumnInfo(name = "phone")
    @SerializedName("phone")
    @Expose
    private long phone;

    @ColumnInfo(name = "phoneStatus")
    @SerializedName("phoneStatus")
    @Expose
    private Integer phoneStatus;

    @ColumnInfo(name = "loginVia")
    @SerializedName("loginVia")
    @Expose
    private Integer loginVia;

    @ColumnInfo(name = "v_")
    @SerializedName("__v")
    @Expose
    private Integer v;

    @Embedded(prefix = "companyName_")
    @SerializedName("companyName")
    @Expose
    private DataObject companyName;

    @ColumnInfo(name = "fullName")
    @SerializedName("fullName")
    @Expose
    private String fullName;

    @ColumnInfo(name = "firstName")
    @SerializedName("firstName")
    @Expose
    private String firstName;

    @ColumnInfo(name = "lastName")
    @SerializedName("lastName")
    @Expose
    private String lastName;

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    @Expose
    private int gender;

    @ColumnInfo(name = "merchantName")
    @SerializedName("merchantName")
    @Expose
    private String merchantName;

    @Embedded(prefix = "profession_")
    @SerializedName("profession")
    @Expose
    private DataObject profession;

    @ColumnInfo(name = "userType_")
    @SerializedName("userType")
    @Expose
    private Integer userType;

    @Embedded(prefix = "category_")
    @SerializedName("category")
    @Expose
    private DataObject category;

    @Embedded(prefix = "yearsOfEstablish_")
    @SerializedName("yearsOfEstablish")
    @Expose
    private DataObject yearsOfEstablish;

    @Embedded(prefix = "yearsOfExperience_")
    @SerializedName("yearsOfExperience")
    @Expose
    private DataObject yearsOfExperience;

    @ColumnInfo(name = "pincode")
    @SerializedName("pincode")
    @Expose
    private String pincode;

    @ColumnInfo(name = "profilePicUrl")
    @SerializedName("profilePicUrl")
    @Expose
    private String profilePicUrl;

    @ColumnInfo(name = "profileScore")
    @SerializedName("profileScore")
    @Expose
    private int profileScore;

    @ColumnInfo(name = "isNewUser")
    @SerializedName("isNewUser")
    @Expose
    private Boolean isNewUser;

    @ColumnInfo(name = "dob")
    @SerializedName("dob")
    @Expose
    private String dob;

    @Embedded(prefix = "website_")
    @SerializedName("website")
    @Expose
    private DataObject website;

    @ColumnInfo(name = "invStatus")
    @SerializedName("invStatus")
    @Expose
    private int invStatus;

    @ColumnInfo(name = "serviceType")
    @SerializedName("serviceType")
    @Expose
    private String serviceType;

    @ColumnInfo(name = "serviceName")
    @SerializedName("serviceName")
    @Expose
    private String serviceName;

    @ColumnInfo(name = "lastSyncDate")
    private String lastSyncDate;

    @ColumnInfo(name = "modifiedDate")
    @SerializedName("modifiedDate")
    @Expose
    private String modifiedDate;

    @ColumnInfo(name = "fullPhone")
    @SerializedName("fullPhone")
    @Expose
    private String fullPhone;

    @Embedded(prefix = "visibility_")
    @SerializedName("visibility")
    @Expose
    private Visibility visibility;


    public String getNetclanId() {
        return netclanId;
    }

    public void setNetclanId(String netclanId) {
        this.netclanId = netclanId;
    }

    public int getProfileScore() {
        return profileScore;
    }

    public void setProfileScore(int profileScore) {
        this.profileScore = profileScore;
    }

    public Integer getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Integer phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public DataObject getCategory() {
        return category;
    }

    public void setCategory(DataObject category) {
        this.category = category;
    }

    public DataObject getWebsite() {
        return website;
    }

    public void setWebsite(DataObject website) {
        this.website = website;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Bio getBio() {
        return bio;
    }

    public void setBio(Bio bio) {
        this.bio = bio;
    }

    public PlaceList getPlaceList() {
        return placeList;
    }

    public void setPlaceList(PlaceList placeList) {
        this.placeList = placeList;
    }

    public SocialList getSocialList() {
        return socialList;
    }

    public void setSocialList(SocialList socialList) {
        this.socialList = socialList;
    }

    public EducationList getEducationList() {
        return educationList;
    }

    public void setEducationList(EducationList educationList) {
        this.educationList = educationList;
    }

    public ProfessionalList getProfessionalList() {
        return professionalList;
    }

    public void setProfessionalList(ProfessionalList professionalList) {
        this.professionalList = professionalList;
    }

    public PersonalPreferences getHobbies() {
        return hobbies;
    }

    public void setHobbies(PersonalPreferences hobbies) {
        this.hobbies = hobbies;
    }

    public PersonalPreferences getMovies() {
        return movies;
    }

    public void setMovies(PersonalPreferences movies) {
        this.movies = movies;
    }

    public PersonalPreferences getSports() {
        return sports;
    }

    public void setSports(PersonalPreferences sports) {
        this.sports = sports;
    }

    public PersonalPreferences getFoodPreferences() {
        return foodPreferences;
    }

    public void setFoodPreferences(PersonalPreferences foodPreferences) {
        this.foodPreferences = foodPreferences;
    }

    public PersonalPreferences getOtherPreferences() {
        return otherPreferences;
    }

    public void setOtherPreferences(PersonalPreferences otherPreferences) {
        this.otherPreferences = otherPreferences;
    }

    public EmergencyDetails getEmergencyDetails() {
        return emergencyDetails;
    }

    public void setEmergencyDetails(EmergencyDetails emergencyDetails) {
        this.emergencyDetails = emergencyDetails;
    }

    public DataObject getEmail() {
        return email;
    }

    public void setEmail(DataObject email) {
        this.email = email;
    }

    public DataObject getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(DataObject officeEmail) {
        this.officeEmail = officeEmail;
    }

    public DataObject getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(DataObject alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public DataObject getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(DataObject officePhone) {
        this.officePhone = officePhone;
    }

    public DataObject getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(DataObject alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Startup getStartup() {
        return startup;
    }

    public void setStartup(Startup startup) {
        this.startup = startup;
    }

    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Integer getLoginVia() {
        return loginVia;
    }

    public void setLoginVia(Integer loginVia) {
        this.loginVia = loginVia;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Boolean getNewUser() {
        return isNewUser;
    }

    public void setNewUser(Boolean newUser) {
        isNewUser = newUser;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public DataObject getCompanyName() {
        return companyName;
    }

    public void setCompanyName(DataObject companyName) {
        this.companyName = companyName;
    }

    public DataObject getProfession() {
        return profession;
    }

    public void setProfession(DataObject profession) {
        this.profession = profession;
    }


    public DataObject getYearsOfEstablish() {
        return yearsOfEstablish;
    }

    public void setYearsOfEstablish(DataObject yearsOfEstablish) {
        this.yearsOfEstablish = yearsOfEstablish;
    }

    public DataObject getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(DataObject yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public int getInvStatus() {
        return invStatus;
    }

    public void setInvStatus(int invStatus) {
        this.invStatus = invStatus;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getLastSyncDate() {
        return lastSyncDate;
    }

    public void setLastSyncDate(String lastSyncDate) {
        this.lastSyncDate = lastSyncDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getFullPhone() {
        return fullPhone;
    }

    public void setFullPhone(String fullPhone) {
        this.fullPhone = fullPhone;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }
}

