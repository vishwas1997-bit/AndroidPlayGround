package com.example.kotlindemo.netclan.RoomForConnectionList;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlindemo.netclan.response_model.Bio;
import com.example.kotlindemo.netclan.response_model.DataObject;
import com.example.kotlindemo.netclan.response_model.EducationItem;
import com.example.kotlindemo.netclan.response_model.EducationList;
import com.example.kotlindemo.netclan.response_model.EmergencyDetails;
import com.example.kotlindemo.netclan.response_model.GetGeneralProfile;
import com.example.kotlindemo.netclan.response_model.Location;
import com.example.kotlindemo.netclan.response_model.PersonalPreferences;
import com.example.kotlindemo.netclan.response_model.PlaceItem;
import com.example.kotlindemo.netclan.response_model.PlaceList;
import com.example.kotlindemo.netclan.response_model.ProfessionItem;
import com.example.kotlindemo.netclan.response_model.ProfessionalList;
import com.example.kotlindemo.netclan.response_model.SocialItem;
import com.example.kotlindemo.netclan.response_model.SocialList;
import com.example.kotlindemo.netclan.response_model.Startup;
import com.example.kotlindemo.netclan.response_model.Visibility;
import com.example.kotlindemo.netclan.response_model.type_converters.DoubleTypeConverters;
import com.example.kotlindemo.netclan.response_model.type_converters.EducationItemTypeConverters;
import com.example.kotlindemo.netclan.response_model.type_converters.PlaceItemTypeConverters;
import com.example.kotlindemo.netclan.response_model.type_converters.ProfessionalItemTypeConverters;
import com.example.kotlindemo.netclan.response_model.type_converters.SocialItemTypeConverters;
import com.example.kotlindemo.netclan.response_model.type_converters.StringTypeConverters;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ConnectionsDao_Impl implements ConnectionsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GetGeneralProfile> __insertionAdapterOfGetGeneralProfile;

  public ConnectionsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGetGeneralProfile = new EntityInsertionAdapter<GetGeneralProfile>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `profile` (`countryCode`,`isVerified`,`_id`,`netClanId`,`phone`,`phoneStatus`,`loginVia`,`v_`,`fullName`,`firstName`,`lastName`,`gender`,`merchantName`,`userType_`,`pincode`,`profilePicUrl`,`profileScore`,`isNewUser`,`dob`,`invStatus`,`serviceType`,`serviceName`,`lastSyncDate`,`modifiedDate`,`fullPhone`,`bio_data`,`bio_status`,`places_data`,`places_status`,`socialMedia_data`,`socialMedia_status`,`education_status`,`education_data`,`professional_data`,`professional_status`,`hobbies_data`,`hobbies_status`,`movies_data`,`movies_status`,`sports_data`,`sports_status`,`foodPreferences_data`,`foodPreferences_status`,`otherPreferences_data`,`otherPreferences_status`,`emergencyDetails_bloodGroup`,`emergencyDetails_doctorContact`,`emergencyDetails_insuranceAgent`,`emergencyDetails_insuranceContact`,`emergencyDetails_emergencyContact`,`emergencyDetails_status`,`email_data`,`email_status`,`officeEmail_data`,`officeEmail_status`,`alternateEmail_data`,`alternateEmail_status`,`officePhone_data`,`officePhone_status`,`alternatePhone_data`,`alternatePhone_status`,`location_coordinates`,`startup_nearByRadius`,`startup_purpose`,`startup_status`,`startup_wishlist`,`companyName_data`,`companyName_status`,`profession_data`,`profession_status`,`category_data`,`category_status`,`yearsOfEstablish_data`,`yearsOfEstablish_status`,`yearsOfExperience_data`,`yearsOfExperience_status`,`website_data`,`website_status`,`visibility_dob_status`,`visibility_profilePic_status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GetGeneralProfile value) {
        if (value.getCountryCode() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCountryCode());
        }
        if (value.getIsVerified() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getIsVerified());
        }
        if (value.getId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getId());
        }
        if (value.getNetclanId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNetclanId());
        }
        stmt.bindLong(5, value.getPhone());
        if (value.getPhoneStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getPhoneStatus());
        }
        if (value.getLoginVia() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getLoginVia());
        }
        if (value.getV() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getV());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFullName());
        }
        if (value.getFirstName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getLastName());
        }
        stmt.bindLong(12, value.getGender());
        if (value.getMerchantName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getMerchantName());
        }
        if (value.getUserType() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getUserType());
        }
        if (value.getPincode() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getPincode());
        }
        if (value.getProfilePicUrl() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getProfilePicUrl());
        }
        stmt.bindLong(17, value.getProfileScore());
        final Integer _tmp = value.getNewUser() == null ? null : (value.getNewUser() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, _tmp);
        }
        if (value.getDob() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getDob());
        }
        stmt.bindLong(20, value.getInvStatus());
        if (value.getServiceType() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getServiceType());
        }
        if (value.getServiceName() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getServiceName());
        }
        if (value.getLastSyncDate() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getLastSyncDate());
        }
        if (value.getModifiedDate() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getModifiedDate());
        }
        if (value.getFullPhone() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getFullPhone());
        }
        final Bio _tmpBio = value.getBio();
        if(_tmpBio != null) {
          if (_tmpBio.getData() == null) {
            stmt.bindNull(26);
          } else {
            stmt.bindString(26, _tmpBio.getData());
          }
          if (_tmpBio.getStatus() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindLong(27, _tmpBio.getStatus());
          }
        } else {
          stmt.bindNull(26);
          stmt.bindNull(27);
        }
        final PlaceList _tmpPlaceList = value.getPlaceList();
        if(_tmpPlaceList != null) {
          final String _tmp_1 = PlaceItemTypeConverters.placeItemsListToString(_tmpPlaceList.getData());
          if (_tmp_1 == null) {
            stmt.bindNull(28);
          } else {
            stmt.bindString(28, _tmp_1);
          }
          if (_tmpPlaceList.getStatus() == null) {
            stmt.bindNull(29);
          } else {
            stmt.bindLong(29, _tmpPlaceList.getStatus());
          }
        } else {
          stmt.bindNull(28);
          stmt.bindNull(29);
        }
        final SocialList _tmpSocialList = value.getSocialList();
        if(_tmpSocialList != null) {
          final String _tmp_2 = SocialItemTypeConverters.socialItemsListToString(_tmpSocialList.getData());
          if (_tmp_2 == null) {
            stmt.bindNull(30);
          } else {
            stmt.bindString(30, _tmp_2);
          }
          if (_tmpSocialList.getStatus() == null) {
            stmt.bindNull(31);
          } else {
            stmt.bindLong(31, _tmpSocialList.getStatus());
          }
        } else {
          stmt.bindNull(30);
          stmt.bindNull(31);
        }
        final EducationList _tmpEducationList = value.getEducationList();
        if(_tmpEducationList != null) {
          if (_tmpEducationList.getStatus() == null) {
            stmt.bindNull(32);
          } else {
            stmt.bindLong(32, _tmpEducationList.getStatus());
          }
          final String _tmp_3 = EducationItemTypeConverters.educationItemsListToString(_tmpEducationList.getData());
          if (_tmp_3 == null) {
            stmt.bindNull(33);
          } else {
            stmt.bindString(33, _tmp_3);
          }
        } else {
          stmt.bindNull(32);
          stmt.bindNull(33);
        }
        final ProfessionalList _tmpProfessionalList = value.getProfessionalList();
        if(_tmpProfessionalList != null) {
          final String _tmp_4 = ProfessionalItemTypeConverters.professionItemsListToString(_tmpProfessionalList.getData());
          if (_tmp_4 == null) {
            stmt.bindNull(34);
          } else {
            stmt.bindString(34, _tmp_4);
          }
          if (_tmpProfessionalList.getStatus() == null) {
            stmt.bindNull(35);
          } else {
            stmt.bindLong(35, _tmpProfessionalList.getStatus());
          }
        } else {
          stmt.bindNull(34);
          stmt.bindNull(35);
        }
        final PersonalPreferences _tmpHobbies = value.getHobbies();
        if(_tmpHobbies != null) {
          final String _tmp_5 = StringTypeConverters.stringListToString(_tmpHobbies.getData());
          if (_tmp_5 == null) {
            stmt.bindNull(36);
          } else {
            stmt.bindString(36, _tmp_5);
          }
          if (_tmpHobbies.getStatus() == null) {
            stmt.bindNull(37);
          } else {
            stmt.bindLong(37, _tmpHobbies.getStatus());
          }
        } else {
          stmt.bindNull(36);
          stmt.bindNull(37);
        }
        final PersonalPreferences _tmpMovies = value.getMovies();
        if(_tmpMovies != null) {
          final String _tmp_6 = StringTypeConverters.stringListToString(_tmpMovies.getData());
          if (_tmp_6 == null) {
            stmt.bindNull(38);
          } else {
            stmt.bindString(38, _tmp_6);
          }
          if (_tmpMovies.getStatus() == null) {
            stmt.bindNull(39);
          } else {
            stmt.bindLong(39, _tmpMovies.getStatus());
          }
        } else {
          stmt.bindNull(38);
          stmt.bindNull(39);
        }
        final PersonalPreferences _tmpSports = value.getSports();
        if(_tmpSports != null) {
          final String _tmp_7 = StringTypeConverters.stringListToString(_tmpSports.getData());
          if (_tmp_7 == null) {
            stmt.bindNull(40);
          } else {
            stmt.bindString(40, _tmp_7);
          }
          if (_tmpSports.getStatus() == null) {
            stmt.bindNull(41);
          } else {
            stmt.bindLong(41, _tmpSports.getStatus());
          }
        } else {
          stmt.bindNull(40);
          stmt.bindNull(41);
        }
        final PersonalPreferences _tmpFoodPreferences = value.getFoodPreferences();
        if(_tmpFoodPreferences != null) {
          final String _tmp_8 = StringTypeConverters.stringListToString(_tmpFoodPreferences.getData());
          if (_tmp_8 == null) {
            stmt.bindNull(42);
          } else {
            stmt.bindString(42, _tmp_8);
          }
          if (_tmpFoodPreferences.getStatus() == null) {
            stmt.bindNull(43);
          } else {
            stmt.bindLong(43, _tmpFoodPreferences.getStatus());
          }
        } else {
          stmt.bindNull(42);
          stmt.bindNull(43);
        }
        final PersonalPreferences _tmpOtherPreferences = value.getOtherPreferences();
        if(_tmpOtherPreferences != null) {
          final String _tmp_9 = StringTypeConverters.stringListToString(_tmpOtherPreferences.getData());
          if (_tmp_9 == null) {
            stmt.bindNull(44);
          } else {
            stmt.bindString(44, _tmp_9);
          }
          if (_tmpOtherPreferences.getStatus() == null) {
            stmt.bindNull(45);
          } else {
            stmt.bindLong(45, _tmpOtherPreferences.getStatus());
          }
        } else {
          stmt.bindNull(44);
          stmt.bindNull(45);
        }
        final EmergencyDetails _tmpEmergencyDetails = value.getEmergencyDetails();
        if(_tmpEmergencyDetails != null) {
          if (_tmpEmergencyDetails.getBloodGroup() == null) {
            stmt.bindNull(46);
          } else {
            stmt.bindString(46, _tmpEmergencyDetails.getBloodGroup());
          }
          if (_tmpEmergencyDetails.getDoctorContact() == null) {
            stmt.bindNull(47);
          } else {
            stmt.bindString(47, _tmpEmergencyDetails.getDoctorContact());
          }
          if (_tmpEmergencyDetails.getInsuranceAgent() == null) {
            stmt.bindNull(48);
          } else {
            stmt.bindString(48, _tmpEmergencyDetails.getInsuranceAgent());
          }
          if (_tmpEmergencyDetails.getInsuranceContact() == null) {
            stmt.bindNull(49);
          } else {
            stmt.bindString(49, _tmpEmergencyDetails.getInsuranceContact());
          }
          if (_tmpEmergencyDetails.getEmergencyContact() == null) {
            stmt.bindNull(50);
          } else {
            stmt.bindString(50, _tmpEmergencyDetails.getEmergencyContact());
          }
          if (_tmpEmergencyDetails.getStatus() == null) {
            stmt.bindNull(51);
          } else {
            stmt.bindLong(51, _tmpEmergencyDetails.getStatus());
          }
        } else {
          stmt.bindNull(46);
          stmt.bindNull(47);
          stmt.bindNull(48);
          stmt.bindNull(49);
          stmt.bindNull(50);
          stmt.bindNull(51);
        }
        final DataObject _tmpEmail = value.getEmail();
        if(_tmpEmail != null) {
          if (_tmpEmail.getData() == null) {
            stmt.bindNull(52);
          } else {
            stmt.bindString(52, _tmpEmail.getData());
          }
          if (_tmpEmail.getStatus() == null) {
            stmt.bindNull(53);
          } else {
            stmt.bindLong(53, _tmpEmail.getStatus());
          }
        } else {
          stmt.bindNull(52);
          stmt.bindNull(53);
        }
        final DataObject _tmpOfficeEmail = value.getOfficeEmail();
        if(_tmpOfficeEmail != null) {
          if (_tmpOfficeEmail.getData() == null) {
            stmt.bindNull(54);
          } else {
            stmt.bindString(54, _tmpOfficeEmail.getData());
          }
          if (_tmpOfficeEmail.getStatus() == null) {
            stmt.bindNull(55);
          } else {
            stmt.bindLong(55, _tmpOfficeEmail.getStatus());
          }
        } else {
          stmt.bindNull(54);
          stmt.bindNull(55);
        }
        final DataObject _tmpAlternateEmail = value.getAlternateEmail();
        if(_tmpAlternateEmail != null) {
          if (_tmpAlternateEmail.getData() == null) {
            stmt.bindNull(56);
          } else {
            stmt.bindString(56, _tmpAlternateEmail.getData());
          }
          if (_tmpAlternateEmail.getStatus() == null) {
            stmt.bindNull(57);
          } else {
            stmt.bindLong(57, _tmpAlternateEmail.getStatus());
          }
        } else {
          stmt.bindNull(56);
          stmt.bindNull(57);
        }
        final DataObject _tmpOfficePhone = value.getOfficePhone();
        if(_tmpOfficePhone != null) {
          if (_tmpOfficePhone.getData() == null) {
            stmt.bindNull(58);
          } else {
            stmt.bindString(58, _tmpOfficePhone.getData());
          }
          if (_tmpOfficePhone.getStatus() == null) {
            stmt.bindNull(59);
          } else {
            stmt.bindLong(59, _tmpOfficePhone.getStatus());
          }
        } else {
          stmt.bindNull(58);
          stmt.bindNull(59);
        }
        final DataObject _tmpAlternatePhone = value.getAlternatePhone();
        if(_tmpAlternatePhone != null) {
          if (_tmpAlternatePhone.getData() == null) {
            stmt.bindNull(60);
          } else {
            stmt.bindString(60, _tmpAlternatePhone.getData());
          }
          if (_tmpAlternatePhone.getStatus() == null) {
            stmt.bindNull(61);
          } else {
            stmt.bindLong(61, _tmpAlternatePhone.getStatus());
          }
        } else {
          stmt.bindNull(60);
          stmt.bindNull(61);
        }
        final Location _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          final String _tmp_10 = DoubleTypeConverters.doubleListToString(_tmpLocation.getCoordinates());
          if (_tmp_10 == null) {
            stmt.bindNull(62);
          } else {
            stmt.bindString(62, _tmp_10);
          }
        } else {
          stmt.bindNull(62);
        }
        final Startup _tmpStartup = value.getStartup();
        if(_tmpStartup != null) {
          if (_tmpStartup.getNearByRadius() == null) {
            stmt.bindNull(63);
          } else {
            stmt.bindLong(63, _tmpStartup.getNearByRadius());
          }
          final String _tmp_11 = StringTypeConverters.stringListToString(_tmpStartup.getPurpose());
          if (_tmp_11 == null) {
            stmt.bindNull(64);
          } else {
            stmt.bindString(64, _tmp_11);
          }
          stmt.bindLong(65, _tmpStartup.getStatus());
          if (_tmpStartup.getWishlist() == null) {
            stmt.bindNull(66);
          } else {
            stmt.bindString(66, _tmpStartup.getWishlist());
          }
        } else {
          stmt.bindNull(63);
          stmt.bindNull(64);
          stmt.bindNull(65);
          stmt.bindNull(66);
        }
        final DataObject _tmpCompanyName = value.getCompanyName();
        if(_tmpCompanyName != null) {
          if (_tmpCompanyName.getData() == null) {
            stmt.bindNull(67);
          } else {
            stmt.bindString(67, _tmpCompanyName.getData());
          }
          if (_tmpCompanyName.getStatus() == null) {
            stmt.bindNull(68);
          } else {
            stmt.bindLong(68, _tmpCompanyName.getStatus());
          }
        } else {
          stmt.bindNull(67);
          stmt.bindNull(68);
        }
        final DataObject _tmpProfession = value.getProfession();
        if(_tmpProfession != null) {
          if (_tmpProfession.getData() == null) {
            stmt.bindNull(69);
          } else {
            stmt.bindString(69, _tmpProfession.getData());
          }
          if (_tmpProfession.getStatus() == null) {
            stmt.bindNull(70);
          } else {
            stmt.bindLong(70, _tmpProfession.getStatus());
          }
        } else {
          stmt.bindNull(69);
          stmt.bindNull(70);
        }
        final DataObject _tmpCategory = value.getCategory();
        if(_tmpCategory != null) {
          if (_tmpCategory.getData() == null) {
            stmt.bindNull(71);
          } else {
            stmt.bindString(71, _tmpCategory.getData());
          }
          if (_tmpCategory.getStatus() == null) {
            stmt.bindNull(72);
          } else {
            stmt.bindLong(72, _tmpCategory.getStatus());
          }
        } else {
          stmt.bindNull(71);
          stmt.bindNull(72);
        }
        final DataObject _tmpYearsOfEstablish = value.getYearsOfEstablish();
        if(_tmpYearsOfEstablish != null) {
          if (_tmpYearsOfEstablish.getData() == null) {
            stmt.bindNull(73);
          } else {
            stmt.bindString(73, _tmpYearsOfEstablish.getData());
          }
          if (_tmpYearsOfEstablish.getStatus() == null) {
            stmt.bindNull(74);
          } else {
            stmt.bindLong(74, _tmpYearsOfEstablish.getStatus());
          }
        } else {
          stmt.bindNull(73);
          stmt.bindNull(74);
        }
        final DataObject _tmpYearsOfExperience = value.getYearsOfExperience();
        if(_tmpYearsOfExperience != null) {
          if (_tmpYearsOfExperience.getData() == null) {
            stmt.bindNull(75);
          } else {
            stmt.bindString(75, _tmpYearsOfExperience.getData());
          }
          if (_tmpYearsOfExperience.getStatus() == null) {
            stmt.bindNull(76);
          } else {
            stmt.bindLong(76, _tmpYearsOfExperience.getStatus());
          }
        } else {
          stmt.bindNull(75);
          stmt.bindNull(76);
        }
        final DataObject _tmpWebsite = value.getWebsite();
        if(_tmpWebsite != null) {
          if (_tmpWebsite.getData() == null) {
            stmt.bindNull(77);
          } else {
            stmt.bindString(77, _tmpWebsite.getData());
          }
          if (_tmpWebsite.getStatus() == null) {
            stmt.bindNull(78);
          } else {
            stmt.bindLong(78, _tmpWebsite.getStatus());
          }
        } else {
          stmt.bindNull(77);
          stmt.bindNull(78);
        }
        final Visibility _tmpVisibility = value.getVisibility();
        if(_tmpVisibility != null) {
          if (_tmpVisibility.getDob() == null) {
            stmt.bindNull(79);
          } else {
            stmt.bindLong(79, _tmpVisibility.getDob());
          }
          if (_tmpVisibility.getProfilePic() == null) {
            stmt.bindNull(80);
          } else {
            stmt.bindLong(80, _tmpVisibility.getProfilePic());
          }
        } else {
          stmt.bindNull(79);
          stmt.bindNull(80);
        }
      }
    };
  }

  @Override
  public void insert(final GetGeneralProfile connectionsEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGetGeneralProfile.insert(connectionsEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<GetGeneralProfile>> getConnections() {
    final String _sql = "select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 order by firstName";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"profile","connection_table"}, false, new Callable<List<GetGeneralProfile>>() {
      @Override
      public List<GetGeneralProfile> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
          final int _cursorIndexOfIsVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "isVerified");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfNetclanId = CursorUtil.getColumnIndexOrThrow(_cursor, "netClanId");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPhoneStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneStatus");
          final int _cursorIndexOfLoginVia = CursorUtil.getColumnIndexOrThrow(_cursor, "loginVia");
          final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "v_");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfMerchantName = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantName");
          final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType_");
          final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
          final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
          final int _cursorIndexOfProfileScore = CursorUtil.getColumnIndexOrThrow(_cursor, "profileScore");
          final int _cursorIndexOfIsNewUser = CursorUtil.getColumnIndexOrThrow(_cursor, "isNewUser");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
          final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
          final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceName");
          final int _cursorIndexOfLastSyncDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSyncDate");
          final int _cursorIndexOfModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedDate");
          final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_data");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_status");
          final int _cursorIndexOfData_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_data");
          final int _cursorIndexOfStatus_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_status");
          final int _cursorIndexOfData_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_data");
          final int _cursorIndexOfStatus_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_status");
          final int _cursorIndexOfStatus_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_status");
          final int _cursorIndexOfData_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_data");
          final int _cursorIndexOfData_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_data");
          final int _cursorIndexOfStatus_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_status");
          final int _cursorIndexOfData_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_data");
          final int _cursorIndexOfStatus_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_status");
          final int _cursorIndexOfData_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_data");
          final int _cursorIndexOfStatus_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_status");
          final int _cursorIndexOfData_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_data");
          final int _cursorIndexOfStatus_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_status");
          final int _cursorIndexOfData_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_data");
          final int _cursorIndexOfStatus_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_status");
          final int _cursorIndexOfData_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_data");
          final int _cursorIndexOfStatus_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_status");
          final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_bloodGroup");
          final int _cursorIndexOfDoctorContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_doctorContact");
          final int _cursorIndexOfInsuranceAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceAgent");
          final int _cursorIndexOfInsuranceContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceContact");
          final int _cursorIndexOfEmergencyContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_emergencyContact");
          final int _cursorIndexOfStatus_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_status");
          final int _cursorIndexOfData_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_data");
          final int _cursorIndexOfStatus_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_status");
          final int _cursorIndexOfData_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_data");
          final int _cursorIndexOfStatus_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_status");
          final int _cursorIndexOfData_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_data");
          final int _cursorIndexOfStatus_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_status");
          final int _cursorIndexOfData_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_data");
          final int _cursorIndexOfStatus_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_status");
          final int _cursorIndexOfData_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_data");
          final int _cursorIndexOfStatus_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_status");
          final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "location_coordinates");
          final int _cursorIndexOfNearByRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_nearByRadius");
          final int _cursorIndexOfPurpose = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_purpose");
          final int _cursorIndexOfStatus_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_status");
          final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_wishlist");
          final int _cursorIndexOfData_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_data");
          final int _cursorIndexOfStatus_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_status");
          final int _cursorIndexOfData_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_data");
          final int _cursorIndexOfStatus_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_status");
          final int _cursorIndexOfData_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_data");
          final int _cursorIndexOfStatus_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_status");
          final int _cursorIndexOfData_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_data");
          final int _cursorIndexOfStatus_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_status");
          final int _cursorIndexOfData_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_data");
          final int _cursorIndexOfStatus_21 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_status");
          final int _cursorIndexOfData_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_data");
          final int _cursorIndexOfStatus_22 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_status");
          final int _cursorIndexOfDob_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_dob_status");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_profilePic_status");
          final List<GetGeneralProfile> _result = new ArrayList<GetGeneralProfile>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GetGeneralProfile _item;
            final Bio _tmpBio;
            if (! (_cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus))) {
              _tmpBio = new Bio();
              final String _tmpData;
              if (_cursor.isNull(_cursorIndexOfData)) {
                _tmpData = null;
              } else {
                _tmpData = _cursor.getString(_cursorIndexOfData);
              }
              _tmpBio.setData(_tmpData);
              final Integer _tmpStatus;
              if (_cursor.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
              }
              _tmpBio.setStatus(_tmpStatus);
            }  else  {
              _tmpBio = null;
            }
            final PlaceList _tmpPlaceList;
            if (! (_cursor.isNull(_cursorIndexOfData_1) && _cursor.isNull(_cursorIndexOfStatus_1))) {
              _tmpPlaceList = new PlaceList();
              final List<PlaceItem> _tmpData_1;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfData_1)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfData_1);
              }
              _tmpData_1 = PlaceItemTypeConverters.stringToPlaceItemsList(_tmp);
              _tmpPlaceList.setData(_tmpData_1);
              final Integer _tmpStatus_1;
              if (_cursor.isNull(_cursorIndexOfStatus_1)) {
                _tmpStatus_1 = null;
              } else {
                _tmpStatus_1 = _cursor.getInt(_cursorIndexOfStatus_1);
              }
              _tmpPlaceList.setStatus(_tmpStatus_1);
            }  else  {
              _tmpPlaceList = null;
            }
            final SocialList _tmpSocialList;
            if (! (_cursor.isNull(_cursorIndexOfData_2) && _cursor.isNull(_cursorIndexOfStatus_2))) {
              _tmpSocialList = new SocialList();
              final List<SocialItem> _tmpData_2;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfData_2)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfData_2);
              }
              _tmpData_2 = SocialItemTypeConverters.stringToSocialItemsList(_tmp_1);
              _tmpSocialList.setData(_tmpData_2);
              final Integer _tmpStatus_2;
              if (_cursor.isNull(_cursorIndexOfStatus_2)) {
                _tmpStatus_2 = null;
              } else {
                _tmpStatus_2 = _cursor.getInt(_cursorIndexOfStatus_2);
              }
              _tmpSocialList.setStatus(_tmpStatus_2);
            }  else  {
              _tmpSocialList = null;
            }
            final EducationList _tmpEducationList;
            if (! (_cursor.isNull(_cursorIndexOfStatus_3) && _cursor.isNull(_cursorIndexOfData_3))) {
              _tmpEducationList = new EducationList();
              final Integer _tmpStatus_3;
              if (_cursor.isNull(_cursorIndexOfStatus_3)) {
                _tmpStatus_3 = null;
              } else {
                _tmpStatus_3 = _cursor.getInt(_cursorIndexOfStatus_3);
              }
              _tmpEducationList.setStatus(_tmpStatus_3);
              final List<EducationItem> _tmpData_3;
              final String _tmp_2;
              if (_cursor.isNull(_cursorIndexOfData_3)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getString(_cursorIndexOfData_3);
              }
              _tmpData_3 = EducationItemTypeConverters.stringToEducationItemsList(_tmp_2);
              _tmpEducationList.setData(_tmpData_3);
            }  else  {
              _tmpEducationList = null;
            }
            final ProfessionalList _tmpProfessionalList;
            if (! (_cursor.isNull(_cursorIndexOfData_4) && _cursor.isNull(_cursorIndexOfStatus_4))) {
              _tmpProfessionalList = new ProfessionalList();
              final List<ProfessionItem> _tmpData_4;
              final String _tmp_3;
              if (_cursor.isNull(_cursorIndexOfData_4)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getString(_cursorIndexOfData_4);
              }
              _tmpData_4 = ProfessionalItemTypeConverters.stringToProfessionItemsList(_tmp_3);
              _tmpProfessionalList.setData(_tmpData_4);
              final Integer _tmpStatus_4;
              if (_cursor.isNull(_cursorIndexOfStatus_4)) {
                _tmpStatus_4 = null;
              } else {
                _tmpStatus_4 = _cursor.getInt(_cursorIndexOfStatus_4);
              }
              _tmpProfessionalList.setStatus(_tmpStatus_4);
            }  else  {
              _tmpProfessionalList = null;
            }
            final PersonalPreferences _tmpHobbies;
            if (! (_cursor.isNull(_cursorIndexOfData_5) && _cursor.isNull(_cursorIndexOfStatus_5))) {
              _tmpHobbies = new PersonalPreferences();
              final List<String> _tmpData_5;
              final String _tmp_4;
              if (_cursor.isNull(_cursorIndexOfData_5)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = _cursor.getString(_cursorIndexOfData_5);
              }
              _tmpData_5 = StringTypeConverters.stringToStringList(_tmp_4);
              _tmpHobbies.setData(_tmpData_5);
              final Integer _tmpStatus_5;
              if (_cursor.isNull(_cursorIndexOfStatus_5)) {
                _tmpStatus_5 = null;
              } else {
                _tmpStatus_5 = _cursor.getInt(_cursorIndexOfStatus_5);
              }
              _tmpHobbies.setStatus(_tmpStatus_5);
            }  else  {
              _tmpHobbies = null;
            }
            final PersonalPreferences _tmpMovies;
            if (! (_cursor.isNull(_cursorIndexOfData_6) && _cursor.isNull(_cursorIndexOfStatus_6))) {
              _tmpMovies = new PersonalPreferences();
              final List<String> _tmpData_6;
              final String _tmp_5;
              if (_cursor.isNull(_cursorIndexOfData_6)) {
                _tmp_5 = null;
              } else {
                _tmp_5 = _cursor.getString(_cursorIndexOfData_6);
              }
              _tmpData_6 = StringTypeConverters.stringToStringList(_tmp_5);
              _tmpMovies.setData(_tmpData_6);
              final Integer _tmpStatus_6;
              if (_cursor.isNull(_cursorIndexOfStatus_6)) {
                _tmpStatus_6 = null;
              } else {
                _tmpStatus_6 = _cursor.getInt(_cursorIndexOfStatus_6);
              }
              _tmpMovies.setStatus(_tmpStatus_6);
            }  else  {
              _tmpMovies = null;
            }
            final PersonalPreferences _tmpSports;
            if (! (_cursor.isNull(_cursorIndexOfData_7) && _cursor.isNull(_cursorIndexOfStatus_7))) {
              _tmpSports = new PersonalPreferences();
              final List<String> _tmpData_7;
              final String _tmp_6;
              if (_cursor.isNull(_cursorIndexOfData_7)) {
                _tmp_6 = null;
              } else {
                _tmp_6 = _cursor.getString(_cursorIndexOfData_7);
              }
              _tmpData_7 = StringTypeConverters.stringToStringList(_tmp_6);
              _tmpSports.setData(_tmpData_7);
              final Integer _tmpStatus_7;
              if (_cursor.isNull(_cursorIndexOfStatus_7)) {
                _tmpStatus_7 = null;
              } else {
                _tmpStatus_7 = _cursor.getInt(_cursorIndexOfStatus_7);
              }
              _tmpSports.setStatus(_tmpStatus_7);
            }  else  {
              _tmpSports = null;
            }
            final PersonalPreferences _tmpFoodPreferences;
            if (! (_cursor.isNull(_cursorIndexOfData_8) && _cursor.isNull(_cursorIndexOfStatus_8))) {
              _tmpFoodPreferences = new PersonalPreferences();
              final List<String> _tmpData_8;
              final String _tmp_7;
              if (_cursor.isNull(_cursorIndexOfData_8)) {
                _tmp_7 = null;
              } else {
                _tmp_7 = _cursor.getString(_cursorIndexOfData_8);
              }
              _tmpData_8 = StringTypeConverters.stringToStringList(_tmp_7);
              _tmpFoodPreferences.setData(_tmpData_8);
              final Integer _tmpStatus_8;
              if (_cursor.isNull(_cursorIndexOfStatus_8)) {
                _tmpStatus_8 = null;
              } else {
                _tmpStatus_8 = _cursor.getInt(_cursorIndexOfStatus_8);
              }
              _tmpFoodPreferences.setStatus(_tmpStatus_8);
            }  else  {
              _tmpFoodPreferences = null;
            }
            final PersonalPreferences _tmpOtherPreferences;
            if (! (_cursor.isNull(_cursorIndexOfData_9) && _cursor.isNull(_cursorIndexOfStatus_9))) {
              _tmpOtherPreferences = new PersonalPreferences();
              final List<String> _tmpData_9;
              final String _tmp_8;
              if (_cursor.isNull(_cursorIndexOfData_9)) {
                _tmp_8 = null;
              } else {
                _tmp_8 = _cursor.getString(_cursorIndexOfData_9);
              }
              _tmpData_9 = StringTypeConverters.stringToStringList(_tmp_8);
              _tmpOtherPreferences.setData(_tmpData_9);
              final Integer _tmpStatus_9;
              if (_cursor.isNull(_cursorIndexOfStatus_9)) {
                _tmpStatus_9 = null;
              } else {
                _tmpStatus_9 = _cursor.getInt(_cursorIndexOfStatus_9);
              }
              _tmpOtherPreferences.setStatus(_tmpStatus_9);
            }  else  {
              _tmpOtherPreferences = null;
            }
            final EmergencyDetails _tmpEmergencyDetails;
            if (! (_cursor.isNull(_cursorIndexOfBloodGroup) && _cursor.isNull(_cursorIndexOfDoctorContact) && _cursor.isNull(_cursorIndexOfInsuranceAgent) && _cursor.isNull(_cursorIndexOfInsuranceContact) && _cursor.isNull(_cursorIndexOfEmergencyContact) && _cursor.isNull(_cursorIndexOfStatus_10))) {
              _tmpEmergencyDetails = new EmergencyDetails();
              final String _tmpBloodGroup;
              if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
                _tmpBloodGroup = null;
              } else {
                _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
              }
              _tmpEmergencyDetails.setBloodGroup(_tmpBloodGroup);
              final String _tmpDoctorContact;
              if (_cursor.isNull(_cursorIndexOfDoctorContact)) {
                _tmpDoctorContact = null;
              } else {
                _tmpDoctorContact = _cursor.getString(_cursorIndexOfDoctorContact);
              }
              _tmpEmergencyDetails.setDoctorContact(_tmpDoctorContact);
              final String _tmpInsuranceAgent;
              if (_cursor.isNull(_cursorIndexOfInsuranceAgent)) {
                _tmpInsuranceAgent = null;
              } else {
                _tmpInsuranceAgent = _cursor.getString(_cursorIndexOfInsuranceAgent);
              }
              _tmpEmergencyDetails.setInsuranceAgent(_tmpInsuranceAgent);
              final String _tmpInsuranceContact;
              if (_cursor.isNull(_cursorIndexOfInsuranceContact)) {
                _tmpInsuranceContact = null;
              } else {
                _tmpInsuranceContact = _cursor.getString(_cursorIndexOfInsuranceContact);
              }
              _tmpEmergencyDetails.setInsuranceContact(_tmpInsuranceContact);
              final String _tmpEmergencyContact;
              if (_cursor.isNull(_cursorIndexOfEmergencyContact)) {
                _tmpEmergencyContact = null;
              } else {
                _tmpEmergencyContact = _cursor.getString(_cursorIndexOfEmergencyContact);
              }
              _tmpEmergencyDetails.setEmergencyContact(_tmpEmergencyContact);
              final Integer _tmpStatus_10;
              if (_cursor.isNull(_cursorIndexOfStatus_10)) {
                _tmpStatus_10 = null;
              } else {
                _tmpStatus_10 = _cursor.getInt(_cursorIndexOfStatus_10);
              }
              _tmpEmergencyDetails.setStatus(_tmpStatus_10);
            }  else  {
              _tmpEmergencyDetails = null;
            }
            final DataObject _tmpEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_10) && _cursor.isNull(_cursorIndexOfStatus_11))) {
              _tmpEmail = new DataObject();
              final String _tmpData_10;
              if (_cursor.isNull(_cursorIndexOfData_10)) {
                _tmpData_10 = null;
              } else {
                _tmpData_10 = _cursor.getString(_cursorIndexOfData_10);
              }
              _tmpEmail.setData(_tmpData_10);
              final Integer _tmpStatus_11;
              if (_cursor.isNull(_cursorIndexOfStatus_11)) {
                _tmpStatus_11 = null;
              } else {
                _tmpStatus_11 = _cursor.getInt(_cursorIndexOfStatus_11);
              }
              _tmpEmail.setStatus(_tmpStatus_11);
            }  else  {
              _tmpEmail = null;
            }
            final DataObject _tmpOfficeEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_11) && _cursor.isNull(_cursorIndexOfStatus_12))) {
              _tmpOfficeEmail = new DataObject();
              final String _tmpData_11;
              if (_cursor.isNull(_cursorIndexOfData_11)) {
                _tmpData_11 = null;
              } else {
                _tmpData_11 = _cursor.getString(_cursorIndexOfData_11);
              }
              _tmpOfficeEmail.setData(_tmpData_11);
              final Integer _tmpStatus_12;
              if (_cursor.isNull(_cursorIndexOfStatus_12)) {
                _tmpStatus_12 = null;
              } else {
                _tmpStatus_12 = _cursor.getInt(_cursorIndexOfStatus_12);
              }
              _tmpOfficeEmail.setStatus(_tmpStatus_12);
            }  else  {
              _tmpOfficeEmail = null;
            }
            final DataObject _tmpAlternateEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_12) && _cursor.isNull(_cursorIndexOfStatus_13))) {
              _tmpAlternateEmail = new DataObject();
              final String _tmpData_12;
              if (_cursor.isNull(_cursorIndexOfData_12)) {
                _tmpData_12 = null;
              } else {
                _tmpData_12 = _cursor.getString(_cursorIndexOfData_12);
              }
              _tmpAlternateEmail.setData(_tmpData_12);
              final Integer _tmpStatus_13;
              if (_cursor.isNull(_cursorIndexOfStatus_13)) {
                _tmpStatus_13 = null;
              } else {
                _tmpStatus_13 = _cursor.getInt(_cursorIndexOfStatus_13);
              }
              _tmpAlternateEmail.setStatus(_tmpStatus_13);
            }  else  {
              _tmpAlternateEmail = null;
            }
            final DataObject _tmpOfficePhone;
            if (! (_cursor.isNull(_cursorIndexOfData_13) && _cursor.isNull(_cursorIndexOfStatus_14))) {
              _tmpOfficePhone = new DataObject();
              final String _tmpData_13;
              if (_cursor.isNull(_cursorIndexOfData_13)) {
                _tmpData_13 = null;
              } else {
                _tmpData_13 = _cursor.getString(_cursorIndexOfData_13);
              }
              _tmpOfficePhone.setData(_tmpData_13);
              final Integer _tmpStatus_14;
              if (_cursor.isNull(_cursorIndexOfStatus_14)) {
                _tmpStatus_14 = null;
              } else {
                _tmpStatus_14 = _cursor.getInt(_cursorIndexOfStatus_14);
              }
              _tmpOfficePhone.setStatus(_tmpStatus_14);
            }  else  {
              _tmpOfficePhone = null;
            }
            final DataObject _tmpAlternatePhone;
            if (! (_cursor.isNull(_cursorIndexOfData_14) && _cursor.isNull(_cursorIndexOfStatus_15))) {
              _tmpAlternatePhone = new DataObject();
              final String _tmpData_14;
              if (_cursor.isNull(_cursorIndexOfData_14)) {
                _tmpData_14 = null;
              } else {
                _tmpData_14 = _cursor.getString(_cursorIndexOfData_14);
              }
              _tmpAlternatePhone.setData(_tmpData_14);
              final Integer _tmpStatus_15;
              if (_cursor.isNull(_cursorIndexOfStatus_15)) {
                _tmpStatus_15 = null;
              } else {
                _tmpStatus_15 = _cursor.getInt(_cursorIndexOfStatus_15);
              }
              _tmpAlternatePhone.setStatus(_tmpStatus_15);
            }  else  {
              _tmpAlternatePhone = null;
            }
            final Location _tmpLocation;
            if (! (_cursor.isNull(_cursorIndexOfCoordinates))) {
              _tmpLocation = new Location();
              final List<Double> _tmpCoordinates;
              final String _tmp_9;
              if (_cursor.isNull(_cursorIndexOfCoordinates)) {
                _tmp_9 = null;
              } else {
                _tmp_9 = _cursor.getString(_cursorIndexOfCoordinates);
              }
              _tmpCoordinates = DoubleTypeConverters.stringToDoubleList(_tmp_9);
              _tmpLocation.setCoordinates(_tmpCoordinates);
            }  else  {
              _tmpLocation = null;
            }
            final Startup _tmpStartup;
            if (! (_cursor.isNull(_cursorIndexOfNearByRadius) && _cursor.isNull(_cursorIndexOfPurpose) && _cursor.isNull(_cursorIndexOfStatus_16) && _cursor.isNull(_cursorIndexOfWishlist))) {
              _tmpStartup = new Startup();
              final Integer _tmpNearByRadius;
              if (_cursor.isNull(_cursorIndexOfNearByRadius)) {
                _tmpNearByRadius = null;
              } else {
                _tmpNearByRadius = _cursor.getInt(_cursorIndexOfNearByRadius);
              }
              _tmpStartup.setNearByRadius(_tmpNearByRadius);
              final List<String> _tmpPurpose;
              final String _tmp_10;
              if (_cursor.isNull(_cursorIndexOfPurpose)) {
                _tmp_10 = null;
              } else {
                _tmp_10 = _cursor.getString(_cursorIndexOfPurpose);
              }
              _tmpPurpose = StringTypeConverters.stringToStringList(_tmp_10);
              _tmpStartup.setPurpose(_tmpPurpose);
              final int _tmpStatus_16;
              _tmpStatus_16 = _cursor.getInt(_cursorIndexOfStatus_16);
              _tmpStartup.setStatus(_tmpStatus_16);
              final String _tmpWishlist;
              if (_cursor.isNull(_cursorIndexOfWishlist)) {
                _tmpWishlist = null;
              } else {
                _tmpWishlist = _cursor.getString(_cursorIndexOfWishlist);
              }
              _tmpStartup.setWishlist(_tmpWishlist);
            }  else  {
              _tmpStartup = null;
            }
            final DataObject _tmpCompanyName;
            if (! (_cursor.isNull(_cursorIndexOfData_15) && _cursor.isNull(_cursorIndexOfStatus_17))) {
              _tmpCompanyName = new DataObject();
              final String _tmpData_15;
              if (_cursor.isNull(_cursorIndexOfData_15)) {
                _tmpData_15 = null;
              } else {
                _tmpData_15 = _cursor.getString(_cursorIndexOfData_15);
              }
              _tmpCompanyName.setData(_tmpData_15);
              final Integer _tmpStatus_17;
              if (_cursor.isNull(_cursorIndexOfStatus_17)) {
                _tmpStatus_17 = null;
              } else {
                _tmpStatus_17 = _cursor.getInt(_cursorIndexOfStatus_17);
              }
              _tmpCompanyName.setStatus(_tmpStatus_17);
            }  else  {
              _tmpCompanyName = null;
            }
            final DataObject _tmpProfession;
            if (! (_cursor.isNull(_cursorIndexOfData_16) && _cursor.isNull(_cursorIndexOfStatus_18))) {
              _tmpProfession = new DataObject();
              final String _tmpData_16;
              if (_cursor.isNull(_cursorIndexOfData_16)) {
                _tmpData_16 = null;
              } else {
                _tmpData_16 = _cursor.getString(_cursorIndexOfData_16);
              }
              _tmpProfession.setData(_tmpData_16);
              final Integer _tmpStatus_18;
              if (_cursor.isNull(_cursorIndexOfStatus_18)) {
                _tmpStatus_18 = null;
              } else {
                _tmpStatus_18 = _cursor.getInt(_cursorIndexOfStatus_18);
              }
              _tmpProfession.setStatus(_tmpStatus_18);
            }  else  {
              _tmpProfession = null;
            }
            final DataObject _tmpCategory;
            if (! (_cursor.isNull(_cursorIndexOfData_17) && _cursor.isNull(_cursorIndexOfStatus_19))) {
              _tmpCategory = new DataObject();
              final String _tmpData_17;
              if (_cursor.isNull(_cursorIndexOfData_17)) {
                _tmpData_17 = null;
              } else {
                _tmpData_17 = _cursor.getString(_cursorIndexOfData_17);
              }
              _tmpCategory.setData(_tmpData_17);
              final Integer _tmpStatus_19;
              if (_cursor.isNull(_cursorIndexOfStatus_19)) {
                _tmpStatus_19 = null;
              } else {
                _tmpStatus_19 = _cursor.getInt(_cursorIndexOfStatus_19);
              }
              _tmpCategory.setStatus(_tmpStatus_19);
            }  else  {
              _tmpCategory = null;
            }
            final DataObject _tmpYearsOfEstablish;
            if (! (_cursor.isNull(_cursorIndexOfData_18) && _cursor.isNull(_cursorIndexOfStatus_20))) {
              _tmpYearsOfEstablish = new DataObject();
              final String _tmpData_18;
              if (_cursor.isNull(_cursorIndexOfData_18)) {
                _tmpData_18 = null;
              } else {
                _tmpData_18 = _cursor.getString(_cursorIndexOfData_18);
              }
              _tmpYearsOfEstablish.setData(_tmpData_18);
              final Integer _tmpStatus_20;
              if (_cursor.isNull(_cursorIndexOfStatus_20)) {
                _tmpStatus_20 = null;
              } else {
                _tmpStatus_20 = _cursor.getInt(_cursorIndexOfStatus_20);
              }
              _tmpYearsOfEstablish.setStatus(_tmpStatus_20);
            }  else  {
              _tmpYearsOfEstablish = null;
            }
            final DataObject _tmpYearsOfExperience;
            if (! (_cursor.isNull(_cursorIndexOfData_19) && _cursor.isNull(_cursorIndexOfStatus_21))) {
              _tmpYearsOfExperience = new DataObject();
              final String _tmpData_19;
              if (_cursor.isNull(_cursorIndexOfData_19)) {
                _tmpData_19 = null;
              } else {
                _tmpData_19 = _cursor.getString(_cursorIndexOfData_19);
              }
              _tmpYearsOfExperience.setData(_tmpData_19);
              final Integer _tmpStatus_21;
              if (_cursor.isNull(_cursorIndexOfStatus_21)) {
                _tmpStatus_21 = null;
              } else {
                _tmpStatus_21 = _cursor.getInt(_cursorIndexOfStatus_21);
              }
              _tmpYearsOfExperience.setStatus(_tmpStatus_21);
            }  else  {
              _tmpYearsOfExperience = null;
            }
            final DataObject _tmpWebsite;
            if (! (_cursor.isNull(_cursorIndexOfData_20) && _cursor.isNull(_cursorIndexOfStatus_22))) {
              _tmpWebsite = new DataObject();
              final String _tmpData_20;
              if (_cursor.isNull(_cursorIndexOfData_20)) {
                _tmpData_20 = null;
              } else {
                _tmpData_20 = _cursor.getString(_cursorIndexOfData_20);
              }
              _tmpWebsite.setData(_tmpData_20);
              final Integer _tmpStatus_22;
              if (_cursor.isNull(_cursorIndexOfStatus_22)) {
                _tmpStatus_22 = null;
              } else {
                _tmpStatus_22 = _cursor.getInt(_cursorIndexOfStatus_22);
              }
              _tmpWebsite.setStatus(_tmpStatus_22);
            }  else  {
              _tmpWebsite = null;
            }
            final Visibility _tmpVisibility;
            if (! (_cursor.isNull(_cursorIndexOfDob_1) && _cursor.isNull(_cursorIndexOfProfilePic))) {
              _tmpVisibility = new Visibility();
              final Integer _tmpDob;
              if (_cursor.isNull(_cursorIndexOfDob_1)) {
                _tmpDob = null;
              } else {
                _tmpDob = _cursor.getInt(_cursorIndexOfDob_1);
              }
              _tmpVisibility.setDob(_tmpDob);
              final Integer _tmpProfilePic;
              if (_cursor.isNull(_cursorIndexOfProfilePic)) {
                _tmpProfilePic = null;
              } else {
                _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
              }
              _tmpVisibility.setProfilePic(_tmpProfilePic);
            }  else  {
              _tmpVisibility = null;
            }
            _item = new GetGeneralProfile();
            final String _tmpCountryCode;
            if (_cursor.isNull(_cursorIndexOfCountryCode)) {
              _tmpCountryCode = null;
            } else {
              _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
            }
            _item.setCountryCode(_tmpCountryCode);
            final Integer _tmpIsVerified;
            if (_cursor.isNull(_cursorIndexOfIsVerified)) {
              _tmpIsVerified = null;
            } else {
              _tmpIsVerified = _cursor.getInt(_cursorIndexOfIsVerified);
            }
            _item.setIsVerified(_tmpIsVerified);
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpNetclanId;
            if (_cursor.isNull(_cursorIndexOfNetclanId)) {
              _tmpNetclanId = null;
            } else {
              _tmpNetclanId = _cursor.getString(_cursorIndexOfNetclanId);
            }
            _item.setNetclanId(_tmpNetclanId);
            final long _tmpPhone;
            _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
            _item.setPhone(_tmpPhone);
            final Integer _tmpPhoneStatus;
            if (_cursor.isNull(_cursorIndexOfPhoneStatus)) {
              _tmpPhoneStatus = null;
            } else {
              _tmpPhoneStatus = _cursor.getInt(_cursorIndexOfPhoneStatus);
            }
            _item.setPhoneStatus(_tmpPhoneStatus);
            final Integer _tmpLoginVia;
            if (_cursor.isNull(_cursorIndexOfLoginVia)) {
              _tmpLoginVia = null;
            } else {
              _tmpLoginVia = _cursor.getInt(_cursorIndexOfLoginVia);
            }
            _item.setLoginVia(_tmpLoginVia);
            final Integer _tmpV;
            if (_cursor.isNull(_cursorIndexOfV)) {
              _tmpV = null;
            } else {
              _tmpV = _cursor.getInt(_cursorIndexOfV);
            }
            _item.setV(_tmpV);
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            _item.setFullName(_tmpFullName);
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            _item.setFirstName(_tmpFirstName);
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            _item.setLastName(_tmpLastName);
            final int _tmpGender;
            _tmpGender = _cursor.getInt(_cursorIndexOfGender);
            _item.setGender(_tmpGender);
            final String _tmpMerchantName;
            if (_cursor.isNull(_cursorIndexOfMerchantName)) {
              _tmpMerchantName = null;
            } else {
              _tmpMerchantName = _cursor.getString(_cursorIndexOfMerchantName);
            }
            _item.setMerchantName(_tmpMerchantName);
            final Integer _tmpUserType;
            if (_cursor.isNull(_cursorIndexOfUserType)) {
              _tmpUserType = null;
            } else {
              _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
            }
            _item.setUserType(_tmpUserType);
            final String _tmpPincode;
            if (_cursor.isNull(_cursorIndexOfPincode)) {
              _tmpPincode = null;
            } else {
              _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
            }
            _item.setPincode(_tmpPincode);
            final String _tmpProfilePicUrl;
            if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
              _tmpProfilePicUrl = null;
            } else {
              _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
            }
            _item.setProfilePicUrl(_tmpProfilePicUrl);
            final int _tmpProfileScore;
            _tmpProfileScore = _cursor.getInt(_cursorIndexOfProfileScore);
            _item.setProfileScore(_tmpProfileScore);
            final Boolean _tmpIsNewUser;
            final Integer _tmp_11;
            if (_cursor.isNull(_cursorIndexOfIsNewUser)) {
              _tmp_11 = null;
            } else {
              _tmp_11 = _cursor.getInt(_cursorIndexOfIsNewUser);
            }
            _tmpIsNewUser = _tmp_11 == null ? null : _tmp_11 != 0;
            _item.setNewUser(_tmpIsNewUser);
            final String _tmpDob_1;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmpDob_1 = null;
            } else {
              _tmpDob_1 = _cursor.getString(_cursorIndexOfDob);
            }
            _item.setDob(_tmpDob_1);
            final int _tmpInvStatus;
            _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
            _item.setInvStatus(_tmpInvStatus);
            final String _tmpServiceType;
            if (_cursor.isNull(_cursorIndexOfServiceType)) {
              _tmpServiceType = null;
            } else {
              _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
            }
            _item.setServiceType(_tmpServiceType);
            final String _tmpServiceName;
            if (_cursor.isNull(_cursorIndexOfServiceName)) {
              _tmpServiceName = null;
            } else {
              _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
            }
            _item.setServiceName(_tmpServiceName);
            final String _tmpLastSyncDate;
            if (_cursor.isNull(_cursorIndexOfLastSyncDate)) {
              _tmpLastSyncDate = null;
            } else {
              _tmpLastSyncDate = _cursor.getString(_cursorIndexOfLastSyncDate);
            }
            _item.setLastSyncDate(_tmpLastSyncDate);
            final String _tmpModifiedDate;
            if (_cursor.isNull(_cursorIndexOfModifiedDate)) {
              _tmpModifiedDate = null;
            } else {
              _tmpModifiedDate = _cursor.getString(_cursorIndexOfModifiedDate);
            }
            _item.setModifiedDate(_tmpModifiedDate);
            final String _tmpFullPhone;
            if (_cursor.isNull(_cursorIndexOfFullPhone)) {
              _tmpFullPhone = null;
            } else {
              _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
            }
            _item.setFullPhone(_tmpFullPhone);
            _item.setBio(_tmpBio);
            _item.setPlaceList(_tmpPlaceList);
            _item.setSocialList(_tmpSocialList);
            _item.setEducationList(_tmpEducationList);
            _item.setProfessionalList(_tmpProfessionalList);
            _item.setHobbies(_tmpHobbies);
            _item.setMovies(_tmpMovies);
            _item.setSports(_tmpSports);
            _item.setFoodPreferences(_tmpFoodPreferences);
            _item.setOtherPreferences(_tmpOtherPreferences);
            _item.setEmergencyDetails(_tmpEmergencyDetails);
            _item.setEmail(_tmpEmail);
            _item.setOfficeEmail(_tmpOfficeEmail);
            _item.setAlternateEmail(_tmpAlternateEmail);
            _item.setOfficePhone(_tmpOfficePhone);
            _item.setAlternatePhone(_tmpAlternatePhone);
            _item.setLocation(_tmpLocation);
            _item.setStartup(_tmpStartup);
            _item.setCompanyName(_tmpCompanyName);
            _item.setProfession(_tmpProfession);
            _item.setCategory(_tmpCategory);
            _item.setYearsOfEstablish(_tmpYearsOfEstablish);
            _item.setYearsOfExperience(_tmpYearsOfExperience);
            _item.setWebsite(_tmpWebsite);
            _item.setVisibility(_tmpVisibility);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<GetGeneralProfile> getConnectionsList() {
    final String _sql = "select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
      final int _cursorIndexOfIsVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "isVerified");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfNetclanId = CursorUtil.getColumnIndexOrThrow(_cursor, "netClanId");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPhoneStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneStatus");
      final int _cursorIndexOfLoginVia = CursorUtil.getColumnIndexOrThrow(_cursor, "loginVia");
      final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "v_");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
      final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfMerchantName = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantName");
      final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType_");
      final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
      final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
      final int _cursorIndexOfProfileScore = CursorUtil.getColumnIndexOrThrow(_cursor, "profileScore");
      final int _cursorIndexOfIsNewUser = CursorUtil.getColumnIndexOrThrow(_cursor, "isNewUser");
      final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
      final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
      final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
      final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceName");
      final int _cursorIndexOfLastSyncDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSyncDate");
      final int _cursorIndexOfModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedDate");
      final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_data");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_status");
      final int _cursorIndexOfData_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_data");
      final int _cursorIndexOfStatus_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_status");
      final int _cursorIndexOfData_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_data");
      final int _cursorIndexOfStatus_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_status");
      final int _cursorIndexOfStatus_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_status");
      final int _cursorIndexOfData_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_data");
      final int _cursorIndexOfData_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_data");
      final int _cursorIndexOfStatus_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_status");
      final int _cursorIndexOfData_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_data");
      final int _cursorIndexOfStatus_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_status");
      final int _cursorIndexOfData_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_data");
      final int _cursorIndexOfStatus_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_status");
      final int _cursorIndexOfData_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_data");
      final int _cursorIndexOfStatus_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_status");
      final int _cursorIndexOfData_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_data");
      final int _cursorIndexOfStatus_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_status");
      final int _cursorIndexOfData_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_data");
      final int _cursorIndexOfStatus_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_status");
      final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_bloodGroup");
      final int _cursorIndexOfDoctorContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_doctorContact");
      final int _cursorIndexOfInsuranceAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceAgent");
      final int _cursorIndexOfInsuranceContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceContact");
      final int _cursorIndexOfEmergencyContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_emergencyContact");
      final int _cursorIndexOfStatus_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_status");
      final int _cursorIndexOfData_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_data");
      final int _cursorIndexOfStatus_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_status");
      final int _cursorIndexOfData_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_data");
      final int _cursorIndexOfStatus_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_status");
      final int _cursorIndexOfData_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_data");
      final int _cursorIndexOfStatus_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_status");
      final int _cursorIndexOfData_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_data");
      final int _cursorIndexOfStatus_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_status");
      final int _cursorIndexOfData_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_data");
      final int _cursorIndexOfStatus_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_status");
      final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "location_coordinates");
      final int _cursorIndexOfNearByRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_nearByRadius");
      final int _cursorIndexOfPurpose = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_purpose");
      final int _cursorIndexOfStatus_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_status");
      final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_wishlist");
      final int _cursorIndexOfData_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_data");
      final int _cursorIndexOfStatus_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_status");
      final int _cursorIndexOfData_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_data");
      final int _cursorIndexOfStatus_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_status");
      final int _cursorIndexOfData_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_data");
      final int _cursorIndexOfStatus_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_status");
      final int _cursorIndexOfData_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_data");
      final int _cursorIndexOfStatus_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_status");
      final int _cursorIndexOfData_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_data");
      final int _cursorIndexOfStatus_21 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_status");
      final int _cursorIndexOfData_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_data");
      final int _cursorIndexOfStatus_22 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_status");
      final int _cursorIndexOfDob_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_dob_status");
      final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_profilePic_status");
      final List<GetGeneralProfile> _result = new ArrayList<GetGeneralProfile>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final GetGeneralProfile _item;
        final Bio _tmpBio;
        if (! (_cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus))) {
          _tmpBio = new Bio();
          final String _tmpData;
          if (_cursor.isNull(_cursorIndexOfData)) {
            _tmpData = null;
          } else {
            _tmpData = _cursor.getString(_cursorIndexOfData);
          }
          _tmpBio.setData(_tmpData);
          final Integer _tmpStatus;
          if (_cursor.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
          }
          _tmpBio.setStatus(_tmpStatus);
        }  else  {
          _tmpBio = null;
        }
        final PlaceList _tmpPlaceList;
        if (! (_cursor.isNull(_cursorIndexOfData_1) && _cursor.isNull(_cursorIndexOfStatus_1))) {
          _tmpPlaceList = new PlaceList();
          final List<PlaceItem> _tmpData_1;
          final String _tmp;
          if (_cursor.isNull(_cursorIndexOfData_1)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getString(_cursorIndexOfData_1);
          }
          _tmpData_1 = PlaceItemTypeConverters.stringToPlaceItemsList(_tmp);
          _tmpPlaceList.setData(_tmpData_1);
          final Integer _tmpStatus_1;
          if (_cursor.isNull(_cursorIndexOfStatus_1)) {
            _tmpStatus_1 = null;
          } else {
            _tmpStatus_1 = _cursor.getInt(_cursorIndexOfStatus_1);
          }
          _tmpPlaceList.setStatus(_tmpStatus_1);
        }  else  {
          _tmpPlaceList = null;
        }
        final SocialList _tmpSocialList;
        if (! (_cursor.isNull(_cursorIndexOfData_2) && _cursor.isNull(_cursorIndexOfStatus_2))) {
          _tmpSocialList = new SocialList();
          final List<SocialItem> _tmpData_2;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfData_2)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfData_2);
          }
          _tmpData_2 = SocialItemTypeConverters.stringToSocialItemsList(_tmp_1);
          _tmpSocialList.setData(_tmpData_2);
          final Integer _tmpStatus_2;
          if (_cursor.isNull(_cursorIndexOfStatus_2)) {
            _tmpStatus_2 = null;
          } else {
            _tmpStatus_2 = _cursor.getInt(_cursorIndexOfStatus_2);
          }
          _tmpSocialList.setStatus(_tmpStatus_2);
        }  else  {
          _tmpSocialList = null;
        }
        final EducationList _tmpEducationList;
        if (! (_cursor.isNull(_cursorIndexOfStatus_3) && _cursor.isNull(_cursorIndexOfData_3))) {
          _tmpEducationList = new EducationList();
          final Integer _tmpStatus_3;
          if (_cursor.isNull(_cursorIndexOfStatus_3)) {
            _tmpStatus_3 = null;
          } else {
            _tmpStatus_3 = _cursor.getInt(_cursorIndexOfStatus_3);
          }
          _tmpEducationList.setStatus(_tmpStatus_3);
          final List<EducationItem> _tmpData_3;
          final String _tmp_2;
          if (_cursor.isNull(_cursorIndexOfData_3)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _cursor.getString(_cursorIndexOfData_3);
          }
          _tmpData_3 = EducationItemTypeConverters.stringToEducationItemsList(_tmp_2);
          _tmpEducationList.setData(_tmpData_3);
        }  else  {
          _tmpEducationList = null;
        }
        final ProfessionalList _tmpProfessionalList;
        if (! (_cursor.isNull(_cursorIndexOfData_4) && _cursor.isNull(_cursorIndexOfStatus_4))) {
          _tmpProfessionalList = new ProfessionalList();
          final List<ProfessionItem> _tmpData_4;
          final String _tmp_3;
          if (_cursor.isNull(_cursorIndexOfData_4)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getString(_cursorIndexOfData_4);
          }
          _tmpData_4 = ProfessionalItemTypeConverters.stringToProfessionItemsList(_tmp_3);
          _tmpProfessionalList.setData(_tmpData_4);
          final Integer _tmpStatus_4;
          if (_cursor.isNull(_cursorIndexOfStatus_4)) {
            _tmpStatus_4 = null;
          } else {
            _tmpStatus_4 = _cursor.getInt(_cursorIndexOfStatus_4);
          }
          _tmpProfessionalList.setStatus(_tmpStatus_4);
        }  else  {
          _tmpProfessionalList = null;
        }
        final PersonalPreferences _tmpHobbies;
        if (! (_cursor.isNull(_cursorIndexOfData_5) && _cursor.isNull(_cursorIndexOfStatus_5))) {
          _tmpHobbies = new PersonalPreferences();
          final List<String> _tmpData_5;
          final String _tmp_4;
          if (_cursor.isNull(_cursorIndexOfData_5)) {
            _tmp_4 = null;
          } else {
            _tmp_4 = _cursor.getString(_cursorIndexOfData_5);
          }
          _tmpData_5 = StringTypeConverters.stringToStringList(_tmp_4);
          _tmpHobbies.setData(_tmpData_5);
          final Integer _tmpStatus_5;
          if (_cursor.isNull(_cursorIndexOfStatus_5)) {
            _tmpStatus_5 = null;
          } else {
            _tmpStatus_5 = _cursor.getInt(_cursorIndexOfStatus_5);
          }
          _tmpHobbies.setStatus(_tmpStatus_5);
        }  else  {
          _tmpHobbies = null;
        }
        final PersonalPreferences _tmpMovies;
        if (! (_cursor.isNull(_cursorIndexOfData_6) && _cursor.isNull(_cursorIndexOfStatus_6))) {
          _tmpMovies = new PersonalPreferences();
          final List<String> _tmpData_6;
          final String _tmp_5;
          if (_cursor.isNull(_cursorIndexOfData_6)) {
            _tmp_5 = null;
          } else {
            _tmp_5 = _cursor.getString(_cursorIndexOfData_6);
          }
          _tmpData_6 = StringTypeConverters.stringToStringList(_tmp_5);
          _tmpMovies.setData(_tmpData_6);
          final Integer _tmpStatus_6;
          if (_cursor.isNull(_cursorIndexOfStatus_6)) {
            _tmpStatus_6 = null;
          } else {
            _tmpStatus_6 = _cursor.getInt(_cursorIndexOfStatus_6);
          }
          _tmpMovies.setStatus(_tmpStatus_6);
        }  else  {
          _tmpMovies = null;
        }
        final PersonalPreferences _tmpSports;
        if (! (_cursor.isNull(_cursorIndexOfData_7) && _cursor.isNull(_cursorIndexOfStatus_7))) {
          _tmpSports = new PersonalPreferences();
          final List<String> _tmpData_7;
          final String _tmp_6;
          if (_cursor.isNull(_cursorIndexOfData_7)) {
            _tmp_6 = null;
          } else {
            _tmp_6 = _cursor.getString(_cursorIndexOfData_7);
          }
          _tmpData_7 = StringTypeConverters.stringToStringList(_tmp_6);
          _tmpSports.setData(_tmpData_7);
          final Integer _tmpStatus_7;
          if (_cursor.isNull(_cursorIndexOfStatus_7)) {
            _tmpStatus_7 = null;
          } else {
            _tmpStatus_7 = _cursor.getInt(_cursorIndexOfStatus_7);
          }
          _tmpSports.setStatus(_tmpStatus_7);
        }  else  {
          _tmpSports = null;
        }
        final PersonalPreferences _tmpFoodPreferences;
        if (! (_cursor.isNull(_cursorIndexOfData_8) && _cursor.isNull(_cursorIndexOfStatus_8))) {
          _tmpFoodPreferences = new PersonalPreferences();
          final List<String> _tmpData_8;
          final String _tmp_7;
          if (_cursor.isNull(_cursorIndexOfData_8)) {
            _tmp_7 = null;
          } else {
            _tmp_7 = _cursor.getString(_cursorIndexOfData_8);
          }
          _tmpData_8 = StringTypeConverters.stringToStringList(_tmp_7);
          _tmpFoodPreferences.setData(_tmpData_8);
          final Integer _tmpStatus_8;
          if (_cursor.isNull(_cursorIndexOfStatus_8)) {
            _tmpStatus_8 = null;
          } else {
            _tmpStatus_8 = _cursor.getInt(_cursorIndexOfStatus_8);
          }
          _tmpFoodPreferences.setStatus(_tmpStatus_8);
        }  else  {
          _tmpFoodPreferences = null;
        }
        final PersonalPreferences _tmpOtherPreferences;
        if (! (_cursor.isNull(_cursorIndexOfData_9) && _cursor.isNull(_cursorIndexOfStatus_9))) {
          _tmpOtherPreferences = new PersonalPreferences();
          final List<String> _tmpData_9;
          final String _tmp_8;
          if (_cursor.isNull(_cursorIndexOfData_9)) {
            _tmp_8 = null;
          } else {
            _tmp_8 = _cursor.getString(_cursorIndexOfData_9);
          }
          _tmpData_9 = StringTypeConverters.stringToStringList(_tmp_8);
          _tmpOtherPreferences.setData(_tmpData_9);
          final Integer _tmpStatus_9;
          if (_cursor.isNull(_cursorIndexOfStatus_9)) {
            _tmpStatus_9 = null;
          } else {
            _tmpStatus_9 = _cursor.getInt(_cursorIndexOfStatus_9);
          }
          _tmpOtherPreferences.setStatus(_tmpStatus_9);
        }  else  {
          _tmpOtherPreferences = null;
        }
        final EmergencyDetails _tmpEmergencyDetails;
        if (! (_cursor.isNull(_cursorIndexOfBloodGroup) && _cursor.isNull(_cursorIndexOfDoctorContact) && _cursor.isNull(_cursorIndexOfInsuranceAgent) && _cursor.isNull(_cursorIndexOfInsuranceContact) && _cursor.isNull(_cursorIndexOfEmergencyContact) && _cursor.isNull(_cursorIndexOfStatus_10))) {
          _tmpEmergencyDetails = new EmergencyDetails();
          final String _tmpBloodGroup;
          if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
          }
          _tmpEmergencyDetails.setBloodGroup(_tmpBloodGroup);
          final String _tmpDoctorContact;
          if (_cursor.isNull(_cursorIndexOfDoctorContact)) {
            _tmpDoctorContact = null;
          } else {
            _tmpDoctorContact = _cursor.getString(_cursorIndexOfDoctorContact);
          }
          _tmpEmergencyDetails.setDoctorContact(_tmpDoctorContact);
          final String _tmpInsuranceAgent;
          if (_cursor.isNull(_cursorIndexOfInsuranceAgent)) {
            _tmpInsuranceAgent = null;
          } else {
            _tmpInsuranceAgent = _cursor.getString(_cursorIndexOfInsuranceAgent);
          }
          _tmpEmergencyDetails.setInsuranceAgent(_tmpInsuranceAgent);
          final String _tmpInsuranceContact;
          if (_cursor.isNull(_cursorIndexOfInsuranceContact)) {
            _tmpInsuranceContact = null;
          } else {
            _tmpInsuranceContact = _cursor.getString(_cursorIndexOfInsuranceContact);
          }
          _tmpEmergencyDetails.setInsuranceContact(_tmpInsuranceContact);
          final String _tmpEmergencyContact;
          if (_cursor.isNull(_cursorIndexOfEmergencyContact)) {
            _tmpEmergencyContact = null;
          } else {
            _tmpEmergencyContact = _cursor.getString(_cursorIndexOfEmergencyContact);
          }
          _tmpEmergencyDetails.setEmergencyContact(_tmpEmergencyContact);
          final Integer _tmpStatus_10;
          if (_cursor.isNull(_cursorIndexOfStatus_10)) {
            _tmpStatus_10 = null;
          } else {
            _tmpStatus_10 = _cursor.getInt(_cursorIndexOfStatus_10);
          }
          _tmpEmergencyDetails.setStatus(_tmpStatus_10);
        }  else  {
          _tmpEmergencyDetails = null;
        }
        final DataObject _tmpEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_10) && _cursor.isNull(_cursorIndexOfStatus_11))) {
          _tmpEmail = new DataObject();
          final String _tmpData_10;
          if (_cursor.isNull(_cursorIndexOfData_10)) {
            _tmpData_10 = null;
          } else {
            _tmpData_10 = _cursor.getString(_cursorIndexOfData_10);
          }
          _tmpEmail.setData(_tmpData_10);
          final Integer _tmpStatus_11;
          if (_cursor.isNull(_cursorIndexOfStatus_11)) {
            _tmpStatus_11 = null;
          } else {
            _tmpStatus_11 = _cursor.getInt(_cursorIndexOfStatus_11);
          }
          _tmpEmail.setStatus(_tmpStatus_11);
        }  else  {
          _tmpEmail = null;
        }
        final DataObject _tmpOfficeEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_11) && _cursor.isNull(_cursorIndexOfStatus_12))) {
          _tmpOfficeEmail = new DataObject();
          final String _tmpData_11;
          if (_cursor.isNull(_cursorIndexOfData_11)) {
            _tmpData_11 = null;
          } else {
            _tmpData_11 = _cursor.getString(_cursorIndexOfData_11);
          }
          _tmpOfficeEmail.setData(_tmpData_11);
          final Integer _tmpStatus_12;
          if (_cursor.isNull(_cursorIndexOfStatus_12)) {
            _tmpStatus_12 = null;
          } else {
            _tmpStatus_12 = _cursor.getInt(_cursorIndexOfStatus_12);
          }
          _tmpOfficeEmail.setStatus(_tmpStatus_12);
        }  else  {
          _tmpOfficeEmail = null;
        }
        final DataObject _tmpAlternateEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_12) && _cursor.isNull(_cursorIndexOfStatus_13))) {
          _tmpAlternateEmail = new DataObject();
          final String _tmpData_12;
          if (_cursor.isNull(_cursorIndexOfData_12)) {
            _tmpData_12 = null;
          } else {
            _tmpData_12 = _cursor.getString(_cursorIndexOfData_12);
          }
          _tmpAlternateEmail.setData(_tmpData_12);
          final Integer _tmpStatus_13;
          if (_cursor.isNull(_cursorIndexOfStatus_13)) {
            _tmpStatus_13 = null;
          } else {
            _tmpStatus_13 = _cursor.getInt(_cursorIndexOfStatus_13);
          }
          _tmpAlternateEmail.setStatus(_tmpStatus_13);
        }  else  {
          _tmpAlternateEmail = null;
        }
        final DataObject _tmpOfficePhone;
        if (! (_cursor.isNull(_cursorIndexOfData_13) && _cursor.isNull(_cursorIndexOfStatus_14))) {
          _tmpOfficePhone = new DataObject();
          final String _tmpData_13;
          if (_cursor.isNull(_cursorIndexOfData_13)) {
            _tmpData_13 = null;
          } else {
            _tmpData_13 = _cursor.getString(_cursorIndexOfData_13);
          }
          _tmpOfficePhone.setData(_tmpData_13);
          final Integer _tmpStatus_14;
          if (_cursor.isNull(_cursorIndexOfStatus_14)) {
            _tmpStatus_14 = null;
          } else {
            _tmpStatus_14 = _cursor.getInt(_cursorIndexOfStatus_14);
          }
          _tmpOfficePhone.setStatus(_tmpStatus_14);
        }  else  {
          _tmpOfficePhone = null;
        }
        final DataObject _tmpAlternatePhone;
        if (! (_cursor.isNull(_cursorIndexOfData_14) && _cursor.isNull(_cursorIndexOfStatus_15))) {
          _tmpAlternatePhone = new DataObject();
          final String _tmpData_14;
          if (_cursor.isNull(_cursorIndexOfData_14)) {
            _tmpData_14 = null;
          } else {
            _tmpData_14 = _cursor.getString(_cursorIndexOfData_14);
          }
          _tmpAlternatePhone.setData(_tmpData_14);
          final Integer _tmpStatus_15;
          if (_cursor.isNull(_cursorIndexOfStatus_15)) {
            _tmpStatus_15 = null;
          } else {
            _tmpStatus_15 = _cursor.getInt(_cursorIndexOfStatus_15);
          }
          _tmpAlternatePhone.setStatus(_tmpStatus_15);
        }  else  {
          _tmpAlternatePhone = null;
        }
        final Location _tmpLocation;
        if (! (_cursor.isNull(_cursorIndexOfCoordinates))) {
          _tmpLocation = new Location();
          final List<Double> _tmpCoordinates;
          final String _tmp_9;
          if (_cursor.isNull(_cursorIndexOfCoordinates)) {
            _tmp_9 = null;
          } else {
            _tmp_9 = _cursor.getString(_cursorIndexOfCoordinates);
          }
          _tmpCoordinates = DoubleTypeConverters.stringToDoubleList(_tmp_9);
          _tmpLocation.setCoordinates(_tmpCoordinates);
        }  else  {
          _tmpLocation = null;
        }
        final Startup _tmpStartup;
        if (! (_cursor.isNull(_cursorIndexOfNearByRadius) && _cursor.isNull(_cursorIndexOfPurpose) && _cursor.isNull(_cursorIndexOfStatus_16) && _cursor.isNull(_cursorIndexOfWishlist))) {
          _tmpStartup = new Startup();
          final Integer _tmpNearByRadius;
          if (_cursor.isNull(_cursorIndexOfNearByRadius)) {
            _tmpNearByRadius = null;
          } else {
            _tmpNearByRadius = _cursor.getInt(_cursorIndexOfNearByRadius);
          }
          _tmpStartup.setNearByRadius(_tmpNearByRadius);
          final List<String> _tmpPurpose;
          final String _tmp_10;
          if (_cursor.isNull(_cursorIndexOfPurpose)) {
            _tmp_10 = null;
          } else {
            _tmp_10 = _cursor.getString(_cursorIndexOfPurpose);
          }
          _tmpPurpose = StringTypeConverters.stringToStringList(_tmp_10);
          _tmpStartup.setPurpose(_tmpPurpose);
          final int _tmpStatus_16;
          _tmpStatus_16 = _cursor.getInt(_cursorIndexOfStatus_16);
          _tmpStartup.setStatus(_tmpStatus_16);
          final String _tmpWishlist;
          if (_cursor.isNull(_cursorIndexOfWishlist)) {
            _tmpWishlist = null;
          } else {
            _tmpWishlist = _cursor.getString(_cursorIndexOfWishlist);
          }
          _tmpStartup.setWishlist(_tmpWishlist);
        }  else  {
          _tmpStartup = null;
        }
        final DataObject _tmpCompanyName;
        if (! (_cursor.isNull(_cursorIndexOfData_15) && _cursor.isNull(_cursorIndexOfStatus_17))) {
          _tmpCompanyName = new DataObject();
          final String _tmpData_15;
          if (_cursor.isNull(_cursorIndexOfData_15)) {
            _tmpData_15 = null;
          } else {
            _tmpData_15 = _cursor.getString(_cursorIndexOfData_15);
          }
          _tmpCompanyName.setData(_tmpData_15);
          final Integer _tmpStatus_17;
          if (_cursor.isNull(_cursorIndexOfStatus_17)) {
            _tmpStatus_17 = null;
          } else {
            _tmpStatus_17 = _cursor.getInt(_cursorIndexOfStatus_17);
          }
          _tmpCompanyName.setStatus(_tmpStatus_17);
        }  else  {
          _tmpCompanyName = null;
        }
        final DataObject _tmpProfession;
        if (! (_cursor.isNull(_cursorIndexOfData_16) && _cursor.isNull(_cursorIndexOfStatus_18))) {
          _tmpProfession = new DataObject();
          final String _tmpData_16;
          if (_cursor.isNull(_cursorIndexOfData_16)) {
            _tmpData_16 = null;
          } else {
            _tmpData_16 = _cursor.getString(_cursorIndexOfData_16);
          }
          _tmpProfession.setData(_tmpData_16);
          final Integer _tmpStatus_18;
          if (_cursor.isNull(_cursorIndexOfStatus_18)) {
            _tmpStatus_18 = null;
          } else {
            _tmpStatus_18 = _cursor.getInt(_cursorIndexOfStatus_18);
          }
          _tmpProfession.setStatus(_tmpStatus_18);
        }  else  {
          _tmpProfession = null;
        }
        final DataObject _tmpCategory;
        if (! (_cursor.isNull(_cursorIndexOfData_17) && _cursor.isNull(_cursorIndexOfStatus_19))) {
          _tmpCategory = new DataObject();
          final String _tmpData_17;
          if (_cursor.isNull(_cursorIndexOfData_17)) {
            _tmpData_17 = null;
          } else {
            _tmpData_17 = _cursor.getString(_cursorIndexOfData_17);
          }
          _tmpCategory.setData(_tmpData_17);
          final Integer _tmpStatus_19;
          if (_cursor.isNull(_cursorIndexOfStatus_19)) {
            _tmpStatus_19 = null;
          } else {
            _tmpStatus_19 = _cursor.getInt(_cursorIndexOfStatus_19);
          }
          _tmpCategory.setStatus(_tmpStatus_19);
        }  else  {
          _tmpCategory = null;
        }
        final DataObject _tmpYearsOfEstablish;
        if (! (_cursor.isNull(_cursorIndexOfData_18) && _cursor.isNull(_cursorIndexOfStatus_20))) {
          _tmpYearsOfEstablish = new DataObject();
          final String _tmpData_18;
          if (_cursor.isNull(_cursorIndexOfData_18)) {
            _tmpData_18 = null;
          } else {
            _tmpData_18 = _cursor.getString(_cursorIndexOfData_18);
          }
          _tmpYearsOfEstablish.setData(_tmpData_18);
          final Integer _tmpStatus_20;
          if (_cursor.isNull(_cursorIndexOfStatus_20)) {
            _tmpStatus_20 = null;
          } else {
            _tmpStatus_20 = _cursor.getInt(_cursorIndexOfStatus_20);
          }
          _tmpYearsOfEstablish.setStatus(_tmpStatus_20);
        }  else  {
          _tmpYearsOfEstablish = null;
        }
        final DataObject _tmpYearsOfExperience;
        if (! (_cursor.isNull(_cursorIndexOfData_19) && _cursor.isNull(_cursorIndexOfStatus_21))) {
          _tmpYearsOfExperience = new DataObject();
          final String _tmpData_19;
          if (_cursor.isNull(_cursorIndexOfData_19)) {
            _tmpData_19 = null;
          } else {
            _tmpData_19 = _cursor.getString(_cursorIndexOfData_19);
          }
          _tmpYearsOfExperience.setData(_tmpData_19);
          final Integer _tmpStatus_21;
          if (_cursor.isNull(_cursorIndexOfStatus_21)) {
            _tmpStatus_21 = null;
          } else {
            _tmpStatus_21 = _cursor.getInt(_cursorIndexOfStatus_21);
          }
          _tmpYearsOfExperience.setStatus(_tmpStatus_21);
        }  else  {
          _tmpYearsOfExperience = null;
        }
        final DataObject _tmpWebsite;
        if (! (_cursor.isNull(_cursorIndexOfData_20) && _cursor.isNull(_cursorIndexOfStatus_22))) {
          _tmpWebsite = new DataObject();
          final String _tmpData_20;
          if (_cursor.isNull(_cursorIndexOfData_20)) {
            _tmpData_20 = null;
          } else {
            _tmpData_20 = _cursor.getString(_cursorIndexOfData_20);
          }
          _tmpWebsite.setData(_tmpData_20);
          final Integer _tmpStatus_22;
          if (_cursor.isNull(_cursorIndexOfStatus_22)) {
            _tmpStatus_22 = null;
          } else {
            _tmpStatus_22 = _cursor.getInt(_cursorIndexOfStatus_22);
          }
          _tmpWebsite.setStatus(_tmpStatus_22);
        }  else  {
          _tmpWebsite = null;
        }
        final Visibility _tmpVisibility;
        if (! (_cursor.isNull(_cursorIndexOfDob_1) && _cursor.isNull(_cursorIndexOfProfilePic))) {
          _tmpVisibility = new Visibility();
          final Integer _tmpDob;
          if (_cursor.isNull(_cursorIndexOfDob_1)) {
            _tmpDob = null;
          } else {
            _tmpDob = _cursor.getInt(_cursorIndexOfDob_1);
          }
          _tmpVisibility.setDob(_tmpDob);
          final Integer _tmpProfilePic;
          if (_cursor.isNull(_cursorIndexOfProfilePic)) {
            _tmpProfilePic = null;
          } else {
            _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
          }
          _tmpVisibility.setProfilePic(_tmpProfilePic);
        }  else  {
          _tmpVisibility = null;
        }
        _item = new GetGeneralProfile();
        final String _tmpCountryCode;
        if (_cursor.isNull(_cursorIndexOfCountryCode)) {
          _tmpCountryCode = null;
        } else {
          _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
        }
        _item.setCountryCode(_tmpCountryCode);
        final Integer _tmpIsVerified;
        if (_cursor.isNull(_cursorIndexOfIsVerified)) {
          _tmpIsVerified = null;
        } else {
          _tmpIsVerified = _cursor.getInt(_cursorIndexOfIsVerified);
        }
        _item.setIsVerified(_tmpIsVerified);
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpNetclanId;
        if (_cursor.isNull(_cursorIndexOfNetclanId)) {
          _tmpNetclanId = null;
        } else {
          _tmpNetclanId = _cursor.getString(_cursorIndexOfNetclanId);
        }
        _item.setNetclanId(_tmpNetclanId);
        final long _tmpPhone;
        _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
        _item.setPhone(_tmpPhone);
        final Integer _tmpPhoneStatus;
        if (_cursor.isNull(_cursorIndexOfPhoneStatus)) {
          _tmpPhoneStatus = null;
        } else {
          _tmpPhoneStatus = _cursor.getInt(_cursorIndexOfPhoneStatus);
        }
        _item.setPhoneStatus(_tmpPhoneStatus);
        final Integer _tmpLoginVia;
        if (_cursor.isNull(_cursorIndexOfLoginVia)) {
          _tmpLoginVia = null;
        } else {
          _tmpLoginVia = _cursor.getInt(_cursorIndexOfLoginVia);
        }
        _item.setLoginVia(_tmpLoginVia);
        final Integer _tmpV;
        if (_cursor.isNull(_cursorIndexOfV)) {
          _tmpV = null;
        } else {
          _tmpV = _cursor.getInt(_cursorIndexOfV);
        }
        _item.setV(_tmpV);
        final String _tmpFullName;
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _tmpFullName = null;
        } else {
          _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
        }
        _item.setFullName(_tmpFullName);
        final String _tmpFirstName;
        if (_cursor.isNull(_cursorIndexOfFirstName)) {
          _tmpFirstName = null;
        } else {
          _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        }
        _item.setFirstName(_tmpFirstName);
        final String _tmpLastName;
        if (_cursor.isNull(_cursorIndexOfLastName)) {
          _tmpLastName = null;
        } else {
          _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
        }
        _item.setLastName(_tmpLastName);
        final int _tmpGender;
        _tmpGender = _cursor.getInt(_cursorIndexOfGender);
        _item.setGender(_tmpGender);
        final String _tmpMerchantName;
        if (_cursor.isNull(_cursorIndexOfMerchantName)) {
          _tmpMerchantName = null;
        } else {
          _tmpMerchantName = _cursor.getString(_cursorIndexOfMerchantName);
        }
        _item.setMerchantName(_tmpMerchantName);
        final Integer _tmpUserType;
        if (_cursor.isNull(_cursorIndexOfUserType)) {
          _tmpUserType = null;
        } else {
          _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
        }
        _item.setUserType(_tmpUserType);
        final String _tmpPincode;
        if (_cursor.isNull(_cursorIndexOfPincode)) {
          _tmpPincode = null;
        } else {
          _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
        }
        _item.setPincode(_tmpPincode);
        final String _tmpProfilePicUrl;
        if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
          _tmpProfilePicUrl = null;
        } else {
          _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
        }
        _item.setProfilePicUrl(_tmpProfilePicUrl);
        final int _tmpProfileScore;
        _tmpProfileScore = _cursor.getInt(_cursorIndexOfProfileScore);
        _item.setProfileScore(_tmpProfileScore);
        final Boolean _tmpIsNewUser;
        final Integer _tmp_11;
        if (_cursor.isNull(_cursorIndexOfIsNewUser)) {
          _tmp_11 = null;
        } else {
          _tmp_11 = _cursor.getInt(_cursorIndexOfIsNewUser);
        }
        _tmpIsNewUser = _tmp_11 == null ? null : _tmp_11 != 0;
        _item.setNewUser(_tmpIsNewUser);
        final String _tmpDob_1;
        if (_cursor.isNull(_cursorIndexOfDob)) {
          _tmpDob_1 = null;
        } else {
          _tmpDob_1 = _cursor.getString(_cursorIndexOfDob);
        }
        _item.setDob(_tmpDob_1);
        final int _tmpInvStatus;
        _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
        _item.setInvStatus(_tmpInvStatus);
        final String _tmpServiceType;
        if (_cursor.isNull(_cursorIndexOfServiceType)) {
          _tmpServiceType = null;
        } else {
          _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
        }
        _item.setServiceType(_tmpServiceType);
        final String _tmpServiceName;
        if (_cursor.isNull(_cursorIndexOfServiceName)) {
          _tmpServiceName = null;
        } else {
          _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
        }
        _item.setServiceName(_tmpServiceName);
        final String _tmpLastSyncDate;
        if (_cursor.isNull(_cursorIndexOfLastSyncDate)) {
          _tmpLastSyncDate = null;
        } else {
          _tmpLastSyncDate = _cursor.getString(_cursorIndexOfLastSyncDate);
        }
        _item.setLastSyncDate(_tmpLastSyncDate);
        final String _tmpModifiedDate;
        if (_cursor.isNull(_cursorIndexOfModifiedDate)) {
          _tmpModifiedDate = null;
        } else {
          _tmpModifiedDate = _cursor.getString(_cursorIndexOfModifiedDate);
        }
        _item.setModifiedDate(_tmpModifiedDate);
        final String _tmpFullPhone;
        if (_cursor.isNull(_cursorIndexOfFullPhone)) {
          _tmpFullPhone = null;
        } else {
          _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
        }
        _item.setFullPhone(_tmpFullPhone);
        _item.setBio(_tmpBio);
        _item.setPlaceList(_tmpPlaceList);
        _item.setSocialList(_tmpSocialList);
        _item.setEducationList(_tmpEducationList);
        _item.setProfessionalList(_tmpProfessionalList);
        _item.setHobbies(_tmpHobbies);
        _item.setMovies(_tmpMovies);
        _item.setSports(_tmpSports);
        _item.setFoodPreferences(_tmpFoodPreferences);
        _item.setOtherPreferences(_tmpOtherPreferences);
        _item.setEmergencyDetails(_tmpEmergencyDetails);
        _item.setEmail(_tmpEmail);
        _item.setOfficeEmail(_tmpOfficeEmail);
        _item.setAlternateEmail(_tmpAlternateEmail);
        _item.setOfficePhone(_tmpOfficePhone);
        _item.setAlternatePhone(_tmpAlternatePhone);
        _item.setLocation(_tmpLocation);
        _item.setStartup(_tmpStartup);
        _item.setCompanyName(_tmpCompanyName);
        _item.setProfession(_tmpProfession);
        _item.setCategory(_tmpCategory);
        _item.setYearsOfEstablish(_tmpYearsOfEstablish);
        _item.setYearsOfExperience(_tmpYearsOfExperience);
        _item.setWebsite(_tmpWebsite);
        _item.setVisibility(_tmpVisibility);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<GetGeneralProfile>> getConnectionsIndividual() {
    final String _sql = "select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 0 union select profile.* from profile inner join buy_sell_chat_table on profile._id = buy_sell_chat_table._id where inChatDataBase = 1 and userType_ = 0 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"profile","connection_table","buy_sell_chat_table","contacts_table"}, false, new Callable<List<GetGeneralProfile>>() {
      @Override
      public List<GetGeneralProfile> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
          final int _cursorIndexOfIsVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "isVerified");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfNetclanId = CursorUtil.getColumnIndexOrThrow(_cursor, "netClanId");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPhoneStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneStatus");
          final int _cursorIndexOfLoginVia = CursorUtil.getColumnIndexOrThrow(_cursor, "loginVia");
          final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "v_");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfMerchantName = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantName");
          final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType_");
          final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
          final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
          final int _cursorIndexOfProfileScore = CursorUtil.getColumnIndexOrThrow(_cursor, "profileScore");
          final int _cursorIndexOfIsNewUser = CursorUtil.getColumnIndexOrThrow(_cursor, "isNewUser");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
          final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
          final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceName");
          final int _cursorIndexOfLastSyncDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSyncDate");
          final int _cursorIndexOfModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedDate");
          final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_data");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_status");
          final int _cursorIndexOfData_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_data");
          final int _cursorIndexOfStatus_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_status");
          final int _cursorIndexOfData_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_data");
          final int _cursorIndexOfStatus_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_status");
          final int _cursorIndexOfStatus_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_status");
          final int _cursorIndexOfData_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_data");
          final int _cursorIndexOfData_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_data");
          final int _cursorIndexOfStatus_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_status");
          final int _cursorIndexOfData_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_data");
          final int _cursorIndexOfStatus_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_status");
          final int _cursorIndexOfData_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_data");
          final int _cursorIndexOfStatus_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_status");
          final int _cursorIndexOfData_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_data");
          final int _cursorIndexOfStatus_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_status");
          final int _cursorIndexOfData_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_data");
          final int _cursorIndexOfStatus_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_status");
          final int _cursorIndexOfData_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_data");
          final int _cursorIndexOfStatus_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_status");
          final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_bloodGroup");
          final int _cursorIndexOfDoctorContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_doctorContact");
          final int _cursorIndexOfInsuranceAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceAgent");
          final int _cursorIndexOfInsuranceContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceContact");
          final int _cursorIndexOfEmergencyContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_emergencyContact");
          final int _cursorIndexOfStatus_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_status");
          final int _cursorIndexOfData_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_data");
          final int _cursorIndexOfStatus_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_status");
          final int _cursorIndexOfData_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_data");
          final int _cursorIndexOfStatus_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_status");
          final int _cursorIndexOfData_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_data");
          final int _cursorIndexOfStatus_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_status");
          final int _cursorIndexOfData_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_data");
          final int _cursorIndexOfStatus_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_status");
          final int _cursorIndexOfData_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_data");
          final int _cursorIndexOfStatus_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_status");
          final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "location_coordinates");
          final int _cursorIndexOfNearByRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_nearByRadius");
          final int _cursorIndexOfPurpose = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_purpose");
          final int _cursorIndexOfStatus_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_status");
          final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_wishlist");
          final int _cursorIndexOfData_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_data");
          final int _cursorIndexOfStatus_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_status");
          final int _cursorIndexOfData_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_data");
          final int _cursorIndexOfStatus_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_status");
          final int _cursorIndexOfData_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_data");
          final int _cursorIndexOfStatus_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_status");
          final int _cursorIndexOfData_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_data");
          final int _cursorIndexOfStatus_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_status");
          final int _cursorIndexOfData_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_data");
          final int _cursorIndexOfStatus_21 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_status");
          final int _cursorIndexOfData_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_data");
          final int _cursorIndexOfStatus_22 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_status");
          final int _cursorIndexOfDob_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_dob_status");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_profilePic_status");
          final List<GetGeneralProfile> _result = new ArrayList<GetGeneralProfile>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GetGeneralProfile _item;
            final Bio _tmpBio;
            if (! (_cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus))) {
              _tmpBio = new Bio();
              final String _tmpData;
              if (_cursor.isNull(_cursorIndexOfData)) {
                _tmpData = null;
              } else {
                _tmpData = _cursor.getString(_cursorIndexOfData);
              }
              _tmpBio.setData(_tmpData);
              final Integer _tmpStatus;
              if (_cursor.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
              }
              _tmpBio.setStatus(_tmpStatus);
            }  else  {
              _tmpBio = null;
            }
            final PlaceList _tmpPlaceList;
            if (! (_cursor.isNull(_cursorIndexOfData_1) && _cursor.isNull(_cursorIndexOfStatus_1))) {
              _tmpPlaceList = new PlaceList();
              final List<PlaceItem> _tmpData_1;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfData_1)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfData_1);
              }
              _tmpData_1 = PlaceItemTypeConverters.stringToPlaceItemsList(_tmp);
              _tmpPlaceList.setData(_tmpData_1);
              final Integer _tmpStatus_1;
              if (_cursor.isNull(_cursorIndexOfStatus_1)) {
                _tmpStatus_1 = null;
              } else {
                _tmpStatus_1 = _cursor.getInt(_cursorIndexOfStatus_1);
              }
              _tmpPlaceList.setStatus(_tmpStatus_1);
            }  else  {
              _tmpPlaceList = null;
            }
            final SocialList _tmpSocialList;
            if (! (_cursor.isNull(_cursorIndexOfData_2) && _cursor.isNull(_cursorIndexOfStatus_2))) {
              _tmpSocialList = new SocialList();
              final List<SocialItem> _tmpData_2;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfData_2)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfData_2);
              }
              _tmpData_2 = SocialItemTypeConverters.stringToSocialItemsList(_tmp_1);
              _tmpSocialList.setData(_tmpData_2);
              final Integer _tmpStatus_2;
              if (_cursor.isNull(_cursorIndexOfStatus_2)) {
                _tmpStatus_2 = null;
              } else {
                _tmpStatus_2 = _cursor.getInt(_cursorIndexOfStatus_2);
              }
              _tmpSocialList.setStatus(_tmpStatus_2);
            }  else  {
              _tmpSocialList = null;
            }
            final EducationList _tmpEducationList;
            if (! (_cursor.isNull(_cursorIndexOfStatus_3) && _cursor.isNull(_cursorIndexOfData_3))) {
              _tmpEducationList = new EducationList();
              final Integer _tmpStatus_3;
              if (_cursor.isNull(_cursorIndexOfStatus_3)) {
                _tmpStatus_3 = null;
              } else {
                _tmpStatus_3 = _cursor.getInt(_cursorIndexOfStatus_3);
              }
              _tmpEducationList.setStatus(_tmpStatus_3);
              final List<EducationItem> _tmpData_3;
              final String _tmp_2;
              if (_cursor.isNull(_cursorIndexOfData_3)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getString(_cursorIndexOfData_3);
              }
              _tmpData_3 = EducationItemTypeConverters.stringToEducationItemsList(_tmp_2);
              _tmpEducationList.setData(_tmpData_3);
            }  else  {
              _tmpEducationList = null;
            }
            final ProfessionalList _tmpProfessionalList;
            if (! (_cursor.isNull(_cursorIndexOfData_4) && _cursor.isNull(_cursorIndexOfStatus_4))) {
              _tmpProfessionalList = new ProfessionalList();
              final List<ProfessionItem> _tmpData_4;
              final String _tmp_3;
              if (_cursor.isNull(_cursorIndexOfData_4)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getString(_cursorIndexOfData_4);
              }
              _tmpData_4 = ProfessionalItemTypeConverters.stringToProfessionItemsList(_tmp_3);
              _tmpProfessionalList.setData(_tmpData_4);
              final Integer _tmpStatus_4;
              if (_cursor.isNull(_cursorIndexOfStatus_4)) {
                _tmpStatus_4 = null;
              } else {
                _tmpStatus_4 = _cursor.getInt(_cursorIndexOfStatus_4);
              }
              _tmpProfessionalList.setStatus(_tmpStatus_4);
            }  else  {
              _tmpProfessionalList = null;
            }
            final PersonalPreferences _tmpHobbies;
            if (! (_cursor.isNull(_cursorIndexOfData_5) && _cursor.isNull(_cursorIndexOfStatus_5))) {
              _tmpHobbies = new PersonalPreferences();
              final List<String> _tmpData_5;
              final String _tmp_4;
              if (_cursor.isNull(_cursorIndexOfData_5)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = _cursor.getString(_cursorIndexOfData_5);
              }
              _tmpData_5 = StringTypeConverters.stringToStringList(_tmp_4);
              _tmpHobbies.setData(_tmpData_5);
              final Integer _tmpStatus_5;
              if (_cursor.isNull(_cursorIndexOfStatus_5)) {
                _tmpStatus_5 = null;
              } else {
                _tmpStatus_5 = _cursor.getInt(_cursorIndexOfStatus_5);
              }
              _tmpHobbies.setStatus(_tmpStatus_5);
            }  else  {
              _tmpHobbies = null;
            }
            final PersonalPreferences _tmpMovies;
            if (! (_cursor.isNull(_cursorIndexOfData_6) && _cursor.isNull(_cursorIndexOfStatus_6))) {
              _tmpMovies = new PersonalPreferences();
              final List<String> _tmpData_6;
              final String _tmp_5;
              if (_cursor.isNull(_cursorIndexOfData_6)) {
                _tmp_5 = null;
              } else {
                _tmp_5 = _cursor.getString(_cursorIndexOfData_6);
              }
              _tmpData_6 = StringTypeConverters.stringToStringList(_tmp_5);
              _tmpMovies.setData(_tmpData_6);
              final Integer _tmpStatus_6;
              if (_cursor.isNull(_cursorIndexOfStatus_6)) {
                _tmpStatus_6 = null;
              } else {
                _tmpStatus_6 = _cursor.getInt(_cursorIndexOfStatus_6);
              }
              _tmpMovies.setStatus(_tmpStatus_6);
            }  else  {
              _tmpMovies = null;
            }
            final PersonalPreferences _tmpSports;
            if (! (_cursor.isNull(_cursorIndexOfData_7) && _cursor.isNull(_cursorIndexOfStatus_7))) {
              _tmpSports = new PersonalPreferences();
              final List<String> _tmpData_7;
              final String _tmp_6;
              if (_cursor.isNull(_cursorIndexOfData_7)) {
                _tmp_6 = null;
              } else {
                _tmp_6 = _cursor.getString(_cursorIndexOfData_7);
              }
              _tmpData_7 = StringTypeConverters.stringToStringList(_tmp_6);
              _tmpSports.setData(_tmpData_7);
              final Integer _tmpStatus_7;
              if (_cursor.isNull(_cursorIndexOfStatus_7)) {
                _tmpStatus_7 = null;
              } else {
                _tmpStatus_7 = _cursor.getInt(_cursorIndexOfStatus_7);
              }
              _tmpSports.setStatus(_tmpStatus_7);
            }  else  {
              _tmpSports = null;
            }
            final PersonalPreferences _tmpFoodPreferences;
            if (! (_cursor.isNull(_cursorIndexOfData_8) && _cursor.isNull(_cursorIndexOfStatus_8))) {
              _tmpFoodPreferences = new PersonalPreferences();
              final List<String> _tmpData_8;
              final String _tmp_7;
              if (_cursor.isNull(_cursorIndexOfData_8)) {
                _tmp_7 = null;
              } else {
                _tmp_7 = _cursor.getString(_cursorIndexOfData_8);
              }
              _tmpData_8 = StringTypeConverters.stringToStringList(_tmp_7);
              _tmpFoodPreferences.setData(_tmpData_8);
              final Integer _tmpStatus_8;
              if (_cursor.isNull(_cursorIndexOfStatus_8)) {
                _tmpStatus_8 = null;
              } else {
                _tmpStatus_8 = _cursor.getInt(_cursorIndexOfStatus_8);
              }
              _tmpFoodPreferences.setStatus(_tmpStatus_8);
            }  else  {
              _tmpFoodPreferences = null;
            }
            final PersonalPreferences _tmpOtherPreferences;
            if (! (_cursor.isNull(_cursorIndexOfData_9) && _cursor.isNull(_cursorIndexOfStatus_9))) {
              _tmpOtherPreferences = new PersonalPreferences();
              final List<String> _tmpData_9;
              final String _tmp_8;
              if (_cursor.isNull(_cursorIndexOfData_9)) {
                _tmp_8 = null;
              } else {
                _tmp_8 = _cursor.getString(_cursorIndexOfData_9);
              }
              _tmpData_9 = StringTypeConverters.stringToStringList(_tmp_8);
              _tmpOtherPreferences.setData(_tmpData_9);
              final Integer _tmpStatus_9;
              if (_cursor.isNull(_cursorIndexOfStatus_9)) {
                _tmpStatus_9 = null;
              } else {
                _tmpStatus_9 = _cursor.getInt(_cursorIndexOfStatus_9);
              }
              _tmpOtherPreferences.setStatus(_tmpStatus_9);
            }  else  {
              _tmpOtherPreferences = null;
            }
            final EmergencyDetails _tmpEmergencyDetails;
            if (! (_cursor.isNull(_cursorIndexOfBloodGroup) && _cursor.isNull(_cursorIndexOfDoctorContact) && _cursor.isNull(_cursorIndexOfInsuranceAgent) && _cursor.isNull(_cursorIndexOfInsuranceContact) && _cursor.isNull(_cursorIndexOfEmergencyContact) && _cursor.isNull(_cursorIndexOfStatus_10))) {
              _tmpEmergencyDetails = new EmergencyDetails();
              final String _tmpBloodGroup;
              if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
                _tmpBloodGroup = null;
              } else {
                _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
              }
              _tmpEmergencyDetails.setBloodGroup(_tmpBloodGroup);
              final String _tmpDoctorContact;
              if (_cursor.isNull(_cursorIndexOfDoctorContact)) {
                _tmpDoctorContact = null;
              } else {
                _tmpDoctorContact = _cursor.getString(_cursorIndexOfDoctorContact);
              }
              _tmpEmergencyDetails.setDoctorContact(_tmpDoctorContact);
              final String _tmpInsuranceAgent;
              if (_cursor.isNull(_cursorIndexOfInsuranceAgent)) {
                _tmpInsuranceAgent = null;
              } else {
                _tmpInsuranceAgent = _cursor.getString(_cursorIndexOfInsuranceAgent);
              }
              _tmpEmergencyDetails.setInsuranceAgent(_tmpInsuranceAgent);
              final String _tmpInsuranceContact;
              if (_cursor.isNull(_cursorIndexOfInsuranceContact)) {
                _tmpInsuranceContact = null;
              } else {
                _tmpInsuranceContact = _cursor.getString(_cursorIndexOfInsuranceContact);
              }
              _tmpEmergencyDetails.setInsuranceContact(_tmpInsuranceContact);
              final String _tmpEmergencyContact;
              if (_cursor.isNull(_cursorIndexOfEmergencyContact)) {
                _tmpEmergencyContact = null;
              } else {
                _tmpEmergencyContact = _cursor.getString(_cursorIndexOfEmergencyContact);
              }
              _tmpEmergencyDetails.setEmergencyContact(_tmpEmergencyContact);
              final Integer _tmpStatus_10;
              if (_cursor.isNull(_cursorIndexOfStatus_10)) {
                _tmpStatus_10 = null;
              } else {
                _tmpStatus_10 = _cursor.getInt(_cursorIndexOfStatus_10);
              }
              _tmpEmergencyDetails.setStatus(_tmpStatus_10);
            }  else  {
              _tmpEmergencyDetails = null;
            }
            final DataObject _tmpEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_10) && _cursor.isNull(_cursorIndexOfStatus_11))) {
              _tmpEmail = new DataObject();
              final String _tmpData_10;
              if (_cursor.isNull(_cursorIndexOfData_10)) {
                _tmpData_10 = null;
              } else {
                _tmpData_10 = _cursor.getString(_cursorIndexOfData_10);
              }
              _tmpEmail.setData(_tmpData_10);
              final Integer _tmpStatus_11;
              if (_cursor.isNull(_cursorIndexOfStatus_11)) {
                _tmpStatus_11 = null;
              } else {
                _tmpStatus_11 = _cursor.getInt(_cursorIndexOfStatus_11);
              }
              _tmpEmail.setStatus(_tmpStatus_11);
            }  else  {
              _tmpEmail = null;
            }
            final DataObject _tmpOfficeEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_11) && _cursor.isNull(_cursorIndexOfStatus_12))) {
              _tmpOfficeEmail = new DataObject();
              final String _tmpData_11;
              if (_cursor.isNull(_cursorIndexOfData_11)) {
                _tmpData_11 = null;
              } else {
                _tmpData_11 = _cursor.getString(_cursorIndexOfData_11);
              }
              _tmpOfficeEmail.setData(_tmpData_11);
              final Integer _tmpStatus_12;
              if (_cursor.isNull(_cursorIndexOfStatus_12)) {
                _tmpStatus_12 = null;
              } else {
                _tmpStatus_12 = _cursor.getInt(_cursorIndexOfStatus_12);
              }
              _tmpOfficeEmail.setStatus(_tmpStatus_12);
            }  else  {
              _tmpOfficeEmail = null;
            }
            final DataObject _tmpAlternateEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_12) && _cursor.isNull(_cursorIndexOfStatus_13))) {
              _tmpAlternateEmail = new DataObject();
              final String _tmpData_12;
              if (_cursor.isNull(_cursorIndexOfData_12)) {
                _tmpData_12 = null;
              } else {
                _tmpData_12 = _cursor.getString(_cursorIndexOfData_12);
              }
              _tmpAlternateEmail.setData(_tmpData_12);
              final Integer _tmpStatus_13;
              if (_cursor.isNull(_cursorIndexOfStatus_13)) {
                _tmpStatus_13 = null;
              } else {
                _tmpStatus_13 = _cursor.getInt(_cursorIndexOfStatus_13);
              }
              _tmpAlternateEmail.setStatus(_tmpStatus_13);
            }  else  {
              _tmpAlternateEmail = null;
            }
            final DataObject _tmpOfficePhone;
            if (! (_cursor.isNull(_cursorIndexOfData_13) && _cursor.isNull(_cursorIndexOfStatus_14))) {
              _tmpOfficePhone = new DataObject();
              final String _tmpData_13;
              if (_cursor.isNull(_cursorIndexOfData_13)) {
                _tmpData_13 = null;
              } else {
                _tmpData_13 = _cursor.getString(_cursorIndexOfData_13);
              }
              _tmpOfficePhone.setData(_tmpData_13);
              final Integer _tmpStatus_14;
              if (_cursor.isNull(_cursorIndexOfStatus_14)) {
                _tmpStatus_14 = null;
              } else {
                _tmpStatus_14 = _cursor.getInt(_cursorIndexOfStatus_14);
              }
              _tmpOfficePhone.setStatus(_tmpStatus_14);
            }  else  {
              _tmpOfficePhone = null;
            }
            final DataObject _tmpAlternatePhone;
            if (! (_cursor.isNull(_cursorIndexOfData_14) && _cursor.isNull(_cursorIndexOfStatus_15))) {
              _tmpAlternatePhone = new DataObject();
              final String _tmpData_14;
              if (_cursor.isNull(_cursorIndexOfData_14)) {
                _tmpData_14 = null;
              } else {
                _tmpData_14 = _cursor.getString(_cursorIndexOfData_14);
              }
              _tmpAlternatePhone.setData(_tmpData_14);
              final Integer _tmpStatus_15;
              if (_cursor.isNull(_cursorIndexOfStatus_15)) {
                _tmpStatus_15 = null;
              } else {
                _tmpStatus_15 = _cursor.getInt(_cursorIndexOfStatus_15);
              }
              _tmpAlternatePhone.setStatus(_tmpStatus_15);
            }  else  {
              _tmpAlternatePhone = null;
            }
            final Location _tmpLocation;
            if (! (_cursor.isNull(_cursorIndexOfCoordinates))) {
              _tmpLocation = new Location();
              final List<Double> _tmpCoordinates;
              final String _tmp_9;
              if (_cursor.isNull(_cursorIndexOfCoordinates)) {
                _tmp_9 = null;
              } else {
                _tmp_9 = _cursor.getString(_cursorIndexOfCoordinates);
              }
              _tmpCoordinates = DoubleTypeConverters.stringToDoubleList(_tmp_9);
              _tmpLocation.setCoordinates(_tmpCoordinates);
            }  else  {
              _tmpLocation = null;
            }
            final Startup _tmpStartup;
            if (! (_cursor.isNull(_cursorIndexOfNearByRadius) && _cursor.isNull(_cursorIndexOfPurpose) && _cursor.isNull(_cursorIndexOfStatus_16) && _cursor.isNull(_cursorIndexOfWishlist))) {
              _tmpStartup = new Startup();
              final Integer _tmpNearByRadius;
              if (_cursor.isNull(_cursorIndexOfNearByRadius)) {
                _tmpNearByRadius = null;
              } else {
                _tmpNearByRadius = _cursor.getInt(_cursorIndexOfNearByRadius);
              }
              _tmpStartup.setNearByRadius(_tmpNearByRadius);
              final List<String> _tmpPurpose;
              final String _tmp_10;
              if (_cursor.isNull(_cursorIndexOfPurpose)) {
                _tmp_10 = null;
              } else {
                _tmp_10 = _cursor.getString(_cursorIndexOfPurpose);
              }
              _tmpPurpose = StringTypeConverters.stringToStringList(_tmp_10);
              _tmpStartup.setPurpose(_tmpPurpose);
              final int _tmpStatus_16;
              _tmpStatus_16 = _cursor.getInt(_cursorIndexOfStatus_16);
              _tmpStartup.setStatus(_tmpStatus_16);
              final String _tmpWishlist;
              if (_cursor.isNull(_cursorIndexOfWishlist)) {
                _tmpWishlist = null;
              } else {
                _tmpWishlist = _cursor.getString(_cursorIndexOfWishlist);
              }
              _tmpStartup.setWishlist(_tmpWishlist);
            }  else  {
              _tmpStartup = null;
            }
            final DataObject _tmpCompanyName;
            if (! (_cursor.isNull(_cursorIndexOfData_15) && _cursor.isNull(_cursorIndexOfStatus_17))) {
              _tmpCompanyName = new DataObject();
              final String _tmpData_15;
              if (_cursor.isNull(_cursorIndexOfData_15)) {
                _tmpData_15 = null;
              } else {
                _tmpData_15 = _cursor.getString(_cursorIndexOfData_15);
              }
              _tmpCompanyName.setData(_tmpData_15);
              final Integer _tmpStatus_17;
              if (_cursor.isNull(_cursorIndexOfStatus_17)) {
                _tmpStatus_17 = null;
              } else {
                _tmpStatus_17 = _cursor.getInt(_cursorIndexOfStatus_17);
              }
              _tmpCompanyName.setStatus(_tmpStatus_17);
            }  else  {
              _tmpCompanyName = null;
            }
            final DataObject _tmpProfession;
            if (! (_cursor.isNull(_cursorIndexOfData_16) && _cursor.isNull(_cursorIndexOfStatus_18))) {
              _tmpProfession = new DataObject();
              final String _tmpData_16;
              if (_cursor.isNull(_cursorIndexOfData_16)) {
                _tmpData_16 = null;
              } else {
                _tmpData_16 = _cursor.getString(_cursorIndexOfData_16);
              }
              _tmpProfession.setData(_tmpData_16);
              final Integer _tmpStatus_18;
              if (_cursor.isNull(_cursorIndexOfStatus_18)) {
                _tmpStatus_18 = null;
              } else {
                _tmpStatus_18 = _cursor.getInt(_cursorIndexOfStatus_18);
              }
              _tmpProfession.setStatus(_tmpStatus_18);
            }  else  {
              _tmpProfession = null;
            }
            final DataObject _tmpCategory;
            if (! (_cursor.isNull(_cursorIndexOfData_17) && _cursor.isNull(_cursorIndexOfStatus_19))) {
              _tmpCategory = new DataObject();
              final String _tmpData_17;
              if (_cursor.isNull(_cursorIndexOfData_17)) {
                _tmpData_17 = null;
              } else {
                _tmpData_17 = _cursor.getString(_cursorIndexOfData_17);
              }
              _tmpCategory.setData(_tmpData_17);
              final Integer _tmpStatus_19;
              if (_cursor.isNull(_cursorIndexOfStatus_19)) {
                _tmpStatus_19 = null;
              } else {
                _tmpStatus_19 = _cursor.getInt(_cursorIndexOfStatus_19);
              }
              _tmpCategory.setStatus(_tmpStatus_19);
            }  else  {
              _tmpCategory = null;
            }
            final DataObject _tmpYearsOfEstablish;
            if (! (_cursor.isNull(_cursorIndexOfData_18) && _cursor.isNull(_cursorIndexOfStatus_20))) {
              _tmpYearsOfEstablish = new DataObject();
              final String _tmpData_18;
              if (_cursor.isNull(_cursorIndexOfData_18)) {
                _tmpData_18 = null;
              } else {
                _tmpData_18 = _cursor.getString(_cursorIndexOfData_18);
              }
              _tmpYearsOfEstablish.setData(_tmpData_18);
              final Integer _tmpStatus_20;
              if (_cursor.isNull(_cursorIndexOfStatus_20)) {
                _tmpStatus_20 = null;
              } else {
                _tmpStatus_20 = _cursor.getInt(_cursorIndexOfStatus_20);
              }
              _tmpYearsOfEstablish.setStatus(_tmpStatus_20);
            }  else  {
              _tmpYearsOfEstablish = null;
            }
            final DataObject _tmpYearsOfExperience;
            if (! (_cursor.isNull(_cursorIndexOfData_19) && _cursor.isNull(_cursorIndexOfStatus_21))) {
              _tmpYearsOfExperience = new DataObject();
              final String _tmpData_19;
              if (_cursor.isNull(_cursorIndexOfData_19)) {
                _tmpData_19 = null;
              } else {
                _tmpData_19 = _cursor.getString(_cursorIndexOfData_19);
              }
              _tmpYearsOfExperience.setData(_tmpData_19);
              final Integer _tmpStatus_21;
              if (_cursor.isNull(_cursorIndexOfStatus_21)) {
                _tmpStatus_21 = null;
              } else {
                _tmpStatus_21 = _cursor.getInt(_cursorIndexOfStatus_21);
              }
              _tmpYearsOfExperience.setStatus(_tmpStatus_21);
            }  else  {
              _tmpYearsOfExperience = null;
            }
            final DataObject _tmpWebsite;
            if (! (_cursor.isNull(_cursorIndexOfData_20) && _cursor.isNull(_cursorIndexOfStatus_22))) {
              _tmpWebsite = new DataObject();
              final String _tmpData_20;
              if (_cursor.isNull(_cursorIndexOfData_20)) {
                _tmpData_20 = null;
              } else {
                _tmpData_20 = _cursor.getString(_cursorIndexOfData_20);
              }
              _tmpWebsite.setData(_tmpData_20);
              final Integer _tmpStatus_22;
              if (_cursor.isNull(_cursorIndexOfStatus_22)) {
                _tmpStatus_22 = null;
              } else {
                _tmpStatus_22 = _cursor.getInt(_cursorIndexOfStatus_22);
              }
              _tmpWebsite.setStatus(_tmpStatus_22);
            }  else  {
              _tmpWebsite = null;
            }
            final Visibility _tmpVisibility;
            if (! (_cursor.isNull(_cursorIndexOfDob_1) && _cursor.isNull(_cursorIndexOfProfilePic))) {
              _tmpVisibility = new Visibility();
              final Integer _tmpDob;
              if (_cursor.isNull(_cursorIndexOfDob_1)) {
                _tmpDob = null;
              } else {
                _tmpDob = _cursor.getInt(_cursorIndexOfDob_1);
              }
              _tmpVisibility.setDob(_tmpDob);
              final Integer _tmpProfilePic;
              if (_cursor.isNull(_cursorIndexOfProfilePic)) {
                _tmpProfilePic = null;
              } else {
                _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
              }
              _tmpVisibility.setProfilePic(_tmpProfilePic);
            }  else  {
              _tmpVisibility = null;
            }
            _item = new GetGeneralProfile();
            final String _tmpCountryCode;
            if (_cursor.isNull(_cursorIndexOfCountryCode)) {
              _tmpCountryCode = null;
            } else {
              _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
            }
            _item.setCountryCode(_tmpCountryCode);
            final Integer _tmpIsVerified;
            if (_cursor.isNull(_cursorIndexOfIsVerified)) {
              _tmpIsVerified = null;
            } else {
              _tmpIsVerified = _cursor.getInt(_cursorIndexOfIsVerified);
            }
            _item.setIsVerified(_tmpIsVerified);
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpNetclanId;
            if (_cursor.isNull(_cursorIndexOfNetclanId)) {
              _tmpNetclanId = null;
            } else {
              _tmpNetclanId = _cursor.getString(_cursorIndexOfNetclanId);
            }
            _item.setNetclanId(_tmpNetclanId);
            final long _tmpPhone;
            _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
            _item.setPhone(_tmpPhone);
            final Integer _tmpPhoneStatus;
            if (_cursor.isNull(_cursorIndexOfPhoneStatus)) {
              _tmpPhoneStatus = null;
            } else {
              _tmpPhoneStatus = _cursor.getInt(_cursorIndexOfPhoneStatus);
            }
            _item.setPhoneStatus(_tmpPhoneStatus);
            final Integer _tmpLoginVia;
            if (_cursor.isNull(_cursorIndexOfLoginVia)) {
              _tmpLoginVia = null;
            } else {
              _tmpLoginVia = _cursor.getInt(_cursorIndexOfLoginVia);
            }
            _item.setLoginVia(_tmpLoginVia);
            final Integer _tmpV;
            if (_cursor.isNull(_cursorIndexOfV)) {
              _tmpV = null;
            } else {
              _tmpV = _cursor.getInt(_cursorIndexOfV);
            }
            _item.setV(_tmpV);
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            _item.setFullName(_tmpFullName);
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            _item.setFirstName(_tmpFirstName);
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            _item.setLastName(_tmpLastName);
            final int _tmpGender;
            _tmpGender = _cursor.getInt(_cursorIndexOfGender);
            _item.setGender(_tmpGender);
            final String _tmpMerchantName;
            if (_cursor.isNull(_cursorIndexOfMerchantName)) {
              _tmpMerchantName = null;
            } else {
              _tmpMerchantName = _cursor.getString(_cursorIndexOfMerchantName);
            }
            _item.setMerchantName(_tmpMerchantName);
            final Integer _tmpUserType;
            if (_cursor.isNull(_cursorIndexOfUserType)) {
              _tmpUserType = null;
            } else {
              _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
            }
            _item.setUserType(_tmpUserType);
            final String _tmpPincode;
            if (_cursor.isNull(_cursorIndexOfPincode)) {
              _tmpPincode = null;
            } else {
              _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
            }
            _item.setPincode(_tmpPincode);
            final String _tmpProfilePicUrl;
            if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
              _tmpProfilePicUrl = null;
            } else {
              _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
            }
            _item.setProfilePicUrl(_tmpProfilePicUrl);
            final int _tmpProfileScore;
            _tmpProfileScore = _cursor.getInt(_cursorIndexOfProfileScore);
            _item.setProfileScore(_tmpProfileScore);
            final Boolean _tmpIsNewUser;
            final Integer _tmp_11;
            if (_cursor.isNull(_cursorIndexOfIsNewUser)) {
              _tmp_11 = null;
            } else {
              _tmp_11 = _cursor.getInt(_cursorIndexOfIsNewUser);
            }
            _tmpIsNewUser = _tmp_11 == null ? null : _tmp_11 != 0;
            _item.setNewUser(_tmpIsNewUser);
            final String _tmpDob_1;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmpDob_1 = null;
            } else {
              _tmpDob_1 = _cursor.getString(_cursorIndexOfDob);
            }
            _item.setDob(_tmpDob_1);
            final int _tmpInvStatus;
            _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
            _item.setInvStatus(_tmpInvStatus);
            final String _tmpServiceType;
            if (_cursor.isNull(_cursorIndexOfServiceType)) {
              _tmpServiceType = null;
            } else {
              _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
            }
            _item.setServiceType(_tmpServiceType);
            final String _tmpServiceName;
            if (_cursor.isNull(_cursorIndexOfServiceName)) {
              _tmpServiceName = null;
            } else {
              _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
            }
            _item.setServiceName(_tmpServiceName);
            final String _tmpLastSyncDate;
            if (_cursor.isNull(_cursorIndexOfLastSyncDate)) {
              _tmpLastSyncDate = null;
            } else {
              _tmpLastSyncDate = _cursor.getString(_cursorIndexOfLastSyncDate);
            }
            _item.setLastSyncDate(_tmpLastSyncDate);
            final String _tmpModifiedDate;
            if (_cursor.isNull(_cursorIndexOfModifiedDate)) {
              _tmpModifiedDate = null;
            } else {
              _tmpModifiedDate = _cursor.getString(_cursorIndexOfModifiedDate);
            }
            _item.setModifiedDate(_tmpModifiedDate);
            final String _tmpFullPhone;
            if (_cursor.isNull(_cursorIndexOfFullPhone)) {
              _tmpFullPhone = null;
            } else {
              _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
            }
            _item.setFullPhone(_tmpFullPhone);
            _item.setBio(_tmpBio);
            _item.setPlaceList(_tmpPlaceList);
            _item.setSocialList(_tmpSocialList);
            _item.setEducationList(_tmpEducationList);
            _item.setProfessionalList(_tmpProfessionalList);
            _item.setHobbies(_tmpHobbies);
            _item.setMovies(_tmpMovies);
            _item.setSports(_tmpSports);
            _item.setFoodPreferences(_tmpFoodPreferences);
            _item.setOtherPreferences(_tmpOtherPreferences);
            _item.setEmergencyDetails(_tmpEmergencyDetails);
            _item.setEmail(_tmpEmail);
            _item.setOfficeEmail(_tmpOfficeEmail);
            _item.setAlternateEmail(_tmpAlternateEmail);
            _item.setOfficePhone(_tmpOfficePhone);
            _item.setAlternatePhone(_tmpAlternatePhone);
            _item.setLocation(_tmpLocation);
            _item.setStartup(_tmpStartup);
            _item.setCompanyName(_tmpCompanyName);
            _item.setProfession(_tmpProfession);
            _item.setCategory(_tmpCategory);
            _item.setYearsOfEstablish(_tmpYearsOfEstablish);
            _item.setYearsOfExperience(_tmpYearsOfExperience);
            _item.setWebsite(_tmpWebsite);
            _item.setVisibility(_tmpVisibility);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<GetGeneralProfile> getConnectionsListIndividual() {
    final String _sql = "select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 0 union select profile.* from profile inner join buy_sell_chat_table on profile._id = buy_sell_chat_table._id where inChatDataBase = 1 and userType_ = 0 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
      final int _cursorIndexOfIsVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "isVerified");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfNetclanId = CursorUtil.getColumnIndexOrThrow(_cursor, "netClanId");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPhoneStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneStatus");
      final int _cursorIndexOfLoginVia = CursorUtil.getColumnIndexOrThrow(_cursor, "loginVia");
      final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "v_");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
      final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfMerchantName = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantName");
      final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType_");
      final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
      final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
      final int _cursorIndexOfProfileScore = CursorUtil.getColumnIndexOrThrow(_cursor, "profileScore");
      final int _cursorIndexOfIsNewUser = CursorUtil.getColumnIndexOrThrow(_cursor, "isNewUser");
      final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
      final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
      final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
      final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceName");
      final int _cursorIndexOfLastSyncDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSyncDate");
      final int _cursorIndexOfModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedDate");
      final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_data");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_status");
      final int _cursorIndexOfData_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_data");
      final int _cursorIndexOfStatus_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_status");
      final int _cursorIndexOfData_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_data");
      final int _cursorIndexOfStatus_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_status");
      final int _cursorIndexOfStatus_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_status");
      final int _cursorIndexOfData_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_data");
      final int _cursorIndexOfData_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_data");
      final int _cursorIndexOfStatus_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_status");
      final int _cursorIndexOfData_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_data");
      final int _cursorIndexOfStatus_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_status");
      final int _cursorIndexOfData_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_data");
      final int _cursorIndexOfStatus_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_status");
      final int _cursorIndexOfData_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_data");
      final int _cursorIndexOfStatus_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_status");
      final int _cursorIndexOfData_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_data");
      final int _cursorIndexOfStatus_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_status");
      final int _cursorIndexOfData_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_data");
      final int _cursorIndexOfStatus_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_status");
      final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_bloodGroup");
      final int _cursorIndexOfDoctorContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_doctorContact");
      final int _cursorIndexOfInsuranceAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceAgent");
      final int _cursorIndexOfInsuranceContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceContact");
      final int _cursorIndexOfEmergencyContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_emergencyContact");
      final int _cursorIndexOfStatus_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_status");
      final int _cursorIndexOfData_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_data");
      final int _cursorIndexOfStatus_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_status");
      final int _cursorIndexOfData_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_data");
      final int _cursorIndexOfStatus_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_status");
      final int _cursorIndexOfData_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_data");
      final int _cursorIndexOfStatus_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_status");
      final int _cursorIndexOfData_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_data");
      final int _cursorIndexOfStatus_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_status");
      final int _cursorIndexOfData_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_data");
      final int _cursorIndexOfStatus_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_status");
      final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "location_coordinates");
      final int _cursorIndexOfNearByRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_nearByRadius");
      final int _cursorIndexOfPurpose = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_purpose");
      final int _cursorIndexOfStatus_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_status");
      final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_wishlist");
      final int _cursorIndexOfData_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_data");
      final int _cursorIndexOfStatus_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_status");
      final int _cursorIndexOfData_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_data");
      final int _cursorIndexOfStatus_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_status");
      final int _cursorIndexOfData_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_data");
      final int _cursorIndexOfStatus_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_status");
      final int _cursorIndexOfData_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_data");
      final int _cursorIndexOfStatus_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_status");
      final int _cursorIndexOfData_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_data");
      final int _cursorIndexOfStatus_21 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_status");
      final int _cursorIndexOfData_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_data");
      final int _cursorIndexOfStatus_22 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_status");
      final int _cursorIndexOfDob_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_dob_status");
      final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_profilePic_status");
      final List<GetGeneralProfile> _result = new ArrayList<GetGeneralProfile>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final GetGeneralProfile _item;
        final Bio _tmpBio;
        if (! (_cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus))) {
          _tmpBio = new Bio();
          final String _tmpData;
          if (_cursor.isNull(_cursorIndexOfData)) {
            _tmpData = null;
          } else {
            _tmpData = _cursor.getString(_cursorIndexOfData);
          }
          _tmpBio.setData(_tmpData);
          final Integer _tmpStatus;
          if (_cursor.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
          }
          _tmpBio.setStatus(_tmpStatus);
        }  else  {
          _tmpBio = null;
        }
        final PlaceList _tmpPlaceList;
        if (! (_cursor.isNull(_cursorIndexOfData_1) && _cursor.isNull(_cursorIndexOfStatus_1))) {
          _tmpPlaceList = new PlaceList();
          final List<PlaceItem> _tmpData_1;
          final String _tmp;
          if (_cursor.isNull(_cursorIndexOfData_1)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getString(_cursorIndexOfData_1);
          }
          _tmpData_1 = PlaceItemTypeConverters.stringToPlaceItemsList(_tmp);
          _tmpPlaceList.setData(_tmpData_1);
          final Integer _tmpStatus_1;
          if (_cursor.isNull(_cursorIndexOfStatus_1)) {
            _tmpStatus_1 = null;
          } else {
            _tmpStatus_1 = _cursor.getInt(_cursorIndexOfStatus_1);
          }
          _tmpPlaceList.setStatus(_tmpStatus_1);
        }  else  {
          _tmpPlaceList = null;
        }
        final SocialList _tmpSocialList;
        if (! (_cursor.isNull(_cursorIndexOfData_2) && _cursor.isNull(_cursorIndexOfStatus_2))) {
          _tmpSocialList = new SocialList();
          final List<SocialItem> _tmpData_2;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfData_2)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfData_2);
          }
          _tmpData_2 = SocialItemTypeConverters.stringToSocialItemsList(_tmp_1);
          _tmpSocialList.setData(_tmpData_2);
          final Integer _tmpStatus_2;
          if (_cursor.isNull(_cursorIndexOfStatus_2)) {
            _tmpStatus_2 = null;
          } else {
            _tmpStatus_2 = _cursor.getInt(_cursorIndexOfStatus_2);
          }
          _tmpSocialList.setStatus(_tmpStatus_2);
        }  else  {
          _tmpSocialList = null;
        }
        final EducationList _tmpEducationList;
        if (! (_cursor.isNull(_cursorIndexOfStatus_3) && _cursor.isNull(_cursorIndexOfData_3))) {
          _tmpEducationList = new EducationList();
          final Integer _tmpStatus_3;
          if (_cursor.isNull(_cursorIndexOfStatus_3)) {
            _tmpStatus_3 = null;
          } else {
            _tmpStatus_3 = _cursor.getInt(_cursorIndexOfStatus_3);
          }
          _tmpEducationList.setStatus(_tmpStatus_3);
          final List<EducationItem> _tmpData_3;
          final String _tmp_2;
          if (_cursor.isNull(_cursorIndexOfData_3)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _cursor.getString(_cursorIndexOfData_3);
          }
          _tmpData_3 = EducationItemTypeConverters.stringToEducationItemsList(_tmp_2);
          _tmpEducationList.setData(_tmpData_3);
        }  else  {
          _tmpEducationList = null;
        }
        final ProfessionalList _tmpProfessionalList;
        if (! (_cursor.isNull(_cursorIndexOfData_4) && _cursor.isNull(_cursorIndexOfStatus_4))) {
          _tmpProfessionalList = new ProfessionalList();
          final List<ProfessionItem> _tmpData_4;
          final String _tmp_3;
          if (_cursor.isNull(_cursorIndexOfData_4)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getString(_cursorIndexOfData_4);
          }
          _tmpData_4 = ProfessionalItemTypeConverters.stringToProfessionItemsList(_tmp_3);
          _tmpProfessionalList.setData(_tmpData_4);
          final Integer _tmpStatus_4;
          if (_cursor.isNull(_cursorIndexOfStatus_4)) {
            _tmpStatus_4 = null;
          } else {
            _tmpStatus_4 = _cursor.getInt(_cursorIndexOfStatus_4);
          }
          _tmpProfessionalList.setStatus(_tmpStatus_4);
        }  else  {
          _tmpProfessionalList = null;
        }
        final PersonalPreferences _tmpHobbies;
        if (! (_cursor.isNull(_cursorIndexOfData_5) && _cursor.isNull(_cursorIndexOfStatus_5))) {
          _tmpHobbies = new PersonalPreferences();
          final List<String> _tmpData_5;
          final String _tmp_4;
          if (_cursor.isNull(_cursorIndexOfData_5)) {
            _tmp_4 = null;
          } else {
            _tmp_4 = _cursor.getString(_cursorIndexOfData_5);
          }
          _tmpData_5 = StringTypeConverters.stringToStringList(_tmp_4);
          _tmpHobbies.setData(_tmpData_5);
          final Integer _tmpStatus_5;
          if (_cursor.isNull(_cursorIndexOfStatus_5)) {
            _tmpStatus_5 = null;
          } else {
            _tmpStatus_5 = _cursor.getInt(_cursorIndexOfStatus_5);
          }
          _tmpHobbies.setStatus(_tmpStatus_5);
        }  else  {
          _tmpHobbies = null;
        }
        final PersonalPreferences _tmpMovies;
        if (! (_cursor.isNull(_cursorIndexOfData_6) && _cursor.isNull(_cursorIndexOfStatus_6))) {
          _tmpMovies = new PersonalPreferences();
          final List<String> _tmpData_6;
          final String _tmp_5;
          if (_cursor.isNull(_cursorIndexOfData_6)) {
            _tmp_5 = null;
          } else {
            _tmp_5 = _cursor.getString(_cursorIndexOfData_6);
          }
          _tmpData_6 = StringTypeConverters.stringToStringList(_tmp_5);
          _tmpMovies.setData(_tmpData_6);
          final Integer _tmpStatus_6;
          if (_cursor.isNull(_cursorIndexOfStatus_6)) {
            _tmpStatus_6 = null;
          } else {
            _tmpStatus_6 = _cursor.getInt(_cursorIndexOfStatus_6);
          }
          _tmpMovies.setStatus(_tmpStatus_6);
        }  else  {
          _tmpMovies = null;
        }
        final PersonalPreferences _tmpSports;
        if (! (_cursor.isNull(_cursorIndexOfData_7) && _cursor.isNull(_cursorIndexOfStatus_7))) {
          _tmpSports = new PersonalPreferences();
          final List<String> _tmpData_7;
          final String _tmp_6;
          if (_cursor.isNull(_cursorIndexOfData_7)) {
            _tmp_6 = null;
          } else {
            _tmp_6 = _cursor.getString(_cursorIndexOfData_7);
          }
          _tmpData_7 = StringTypeConverters.stringToStringList(_tmp_6);
          _tmpSports.setData(_tmpData_7);
          final Integer _tmpStatus_7;
          if (_cursor.isNull(_cursorIndexOfStatus_7)) {
            _tmpStatus_7 = null;
          } else {
            _tmpStatus_7 = _cursor.getInt(_cursorIndexOfStatus_7);
          }
          _tmpSports.setStatus(_tmpStatus_7);
        }  else  {
          _tmpSports = null;
        }
        final PersonalPreferences _tmpFoodPreferences;
        if (! (_cursor.isNull(_cursorIndexOfData_8) && _cursor.isNull(_cursorIndexOfStatus_8))) {
          _tmpFoodPreferences = new PersonalPreferences();
          final List<String> _tmpData_8;
          final String _tmp_7;
          if (_cursor.isNull(_cursorIndexOfData_8)) {
            _tmp_7 = null;
          } else {
            _tmp_7 = _cursor.getString(_cursorIndexOfData_8);
          }
          _tmpData_8 = StringTypeConverters.stringToStringList(_tmp_7);
          _tmpFoodPreferences.setData(_tmpData_8);
          final Integer _tmpStatus_8;
          if (_cursor.isNull(_cursorIndexOfStatus_8)) {
            _tmpStatus_8 = null;
          } else {
            _tmpStatus_8 = _cursor.getInt(_cursorIndexOfStatus_8);
          }
          _tmpFoodPreferences.setStatus(_tmpStatus_8);
        }  else  {
          _tmpFoodPreferences = null;
        }
        final PersonalPreferences _tmpOtherPreferences;
        if (! (_cursor.isNull(_cursorIndexOfData_9) && _cursor.isNull(_cursorIndexOfStatus_9))) {
          _tmpOtherPreferences = new PersonalPreferences();
          final List<String> _tmpData_9;
          final String _tmp_8;
          if (_cursor.isNull(_cursorIndexOfData_9)) {
            _tmp_8 = null;
          } else {
            _tmp_8 = _cursor.getString(_cursorIndexOfData_9);
          }
          _tmpData_9 = StringTypeConverters.stringToStringList(_tmp_8);
          _tmpOtherPreferences.setData(_tmpData_9);
          final Integer _tmpStatus_9;
          if (_cursor.isNull(_cursorIndexOfStatus_9)) {
            _tmpStatus_9 = null;
          } else {
            _tmpStatus_9 = _cursor.getInt(_cursorIndexOfStatus_9);
          }
          _tmpOtherPreferences.setStatus(_tmpStatus_9);
        }  else  {
          _tmpOtherPreferences = null;
        }
        final EmergencyDetails _tmpEmergencyDetails;
        if (! (_cursor.isNull(_cursorIndexOfBloodGroup) && _cursor.isNull(_cursorIndexOfDoctorContact) && _cursor.isNull(_cursorIndexOfInsuranceAgent) && _cursor.isNull(_cursorIndexOfInsuranceContact) && _cursor.isNull(_cursorIndexOfEmergencyContact) && _cursor.isNull(_cursorIndexOfStatus_10))) {
          _tmpEmergencyDetails = new EmergencyDetails();
          final String _tmpBloodGroup;
          if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
          }
          _tmpEmergencyDetails.setBloodGroup(_tmpBloodGroup);
          final String _tmpDoctorContact;
          if (_cursor.isNull(_cursorIndexOfDoctorContact)) {
            _tmpDoctorContact = null;
          } else {
            _tmpDoctorContact = _cursor.getString(_cursorIndexOfDoctorContact);
          }
          _tmpEmergencyDetails.setDoctorContact(_tmpDoctorContact);
          final String _tmpInsuranceAgent;
          if (_cursor.isNull(_cursorIndexOfInsuranceAgent)) {
            _tmpInsuranceAgent = null;
          } else {
            _tmpInsuranceAgent = _cursor.getString(_cursorIndexOfInsuranceAgent);
          }
          _tmpEmergencyDetails.setInsuranceAgent(_tmpInsuranceAgent);
          final String _tmpInsuranceContact;
          if (_cursor.isNull(_cursorIndexOfInsuranceContact)) {
            _tmpInsuranceContact = null;
          } else {
            _tmpInsuranceContact = _cursor.getString(_cursorIndexOfInsuranceContact);
          }
          _tmpEmergencyDetails.setInsuranceContact(_tmpInsuranceContact);
          final String _tmpEmergencyContact;
          if (_cursor.isNull(_cursorIndexOfEmergencyContact)) {
            _tmpEmergencyContact = null;
          } else {
            _tmpEmergencyContact = _cursor.getString(_cursorIndexOfEmergencyContact);
          }
          _tmpEmergencyDetails.setEmergencyContact(_tmpEmergencyContact);
          final Integer _tmpStatus_10;
          if (_cursor.isNull(_cursorIndexOfStatus_10)) {
            _tmpStatus_10 = null;
          } else {
            _tmpStatus_10 = _cursor.getInt(_cursorIndexOfStatus_10);
          }
          _tmpEmergencyDetails.setStatus(_tmpStatus_10);
        }  else  {
          _tmpEmergencyDetails = null;
        }
        final DataObject _tmpEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_10) && _cursor.isNull(_cursorIndexOfStatus_11))) {
          _tmpEmail = new DataObject();
          final String _tmpData_10;
          if (_cursor.isNull(_cursorIndexOfData_10)) {
            _tmpData_10 = null;
          } else {
            _tmpData_10 = _cursor.getString(_cursorIndexOfData_10);
          }
          _tmpEmail.setData(_tmpData_10);
          final Integer _tmpStatus_11;
          if (_cursor.isNull(_cursorIndexOfStatus_11)) {
            _tmpStatus_11 = null;
          } else {
            _tmpStatus_11 = _cursor.getInt(_cursorIndexOfStatus_11);
          }
          _tmpEmail.setStatus(_tmpStatus_11);
        }  else  {
          _tmpEmail = null;
        }
        final DataObject _tmpOfficeEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_11) && _cursor.isNull(_cursorIndexOfStatus_12))) {
          _tmpOfficeEmail = new DataObject();
          final String _tmpData_11;
          if (_cursor.isNull(_cursorIndexOfData_11)) {
            _tmpData_11 = null;
          } else {
            _tmpData_11 = _cursor.getString(_cursorIndexOfData_11);
          }
          _tmpOfficeEmail.setData(_tmpData_11);
          final Integer _tmpStatus_12;
          if (_cursor.isNull(_cursorIndexOfStatus_12)) {
            _tmpStatus_12 = null;
          } else {
            _tmpStatus_12 = _cursor.getInt(_cursorIndexOfStatus_12);
          }
          _tmpOfficeEmail.setStatus(_tmpStatus_12);
        }  else  {
          _tmpOfficeEmail = null;
        }
        final DataObject _tmpAlternateEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_12) && _cursor.isNull(_cursorIndexOfStatus_13))) {
          _tmpAlternateEmail = new DataObject();
          final String _tmpData_12;
          if (_cursor.isNull(_cursorIndexOfData_12)) {
            _tmpData_12 = null;
          } else {
            _tmpData_12 = _cursor.getString(_cursorIndexOfData_12);
          }
          _tmpAlternateEmail.setData(_tmpData_12);
          final Integer _tmpStatus_13;
          if (_cursor.isNull(_cursorIndexOfStatus_13)) {
            _tmpStatus_13 = null;
          } else {
            _tmpStatus_13 = _cursor.getInt(_cursorIndexOfStatus_13);
          }
          _tmpAlternateEmail.setStatus(_tmpStatus_13);
        }  else  {
          _tmpAlternateEmail = null;
        }
        final DataObject _tmpOfficePhone;
        if (! (_cursor.isNull(_cursorIndexOfData_13) && _cursor.isNull(_cursorIndexOfStatus_14))) {
          _tmpOfficePhone = new DataObject();
          final String _tmpData_13;
          if (_cursor.isNull(_cursorIndexOfData_13)) {
            _tmpData_13 = null;
          } else {
            _tmpData_13 = _cursor.getString(_cursorIndexOfData_13);
          }
          _tmpOfficePhone.setData(_tmpData_13);
          final Integer _tmpStatus_14;
          if (_cursor.isNull(_cursorIndexOfStatus_14)) {
            _tmpStatus_14 = null;
          } else {
            _tmpStatus_14 = _cursor.getInt(_cursorIndexOfStatus_14);
          }
          _tmpOfficePhone.setStatus(_tmpStatus_14);
        }  else  {
          _tmpOfficePhone = null;
        }
        final DataObject _tmpAlternatePhone;
        if (! (_cursor.isNull(_cursorIndexOfData_14) && _cursor.isNull(_cursorIndexOfStatus_15))) {
          _tmpAlternatePhone = new DataObject();
          final String _tmpData_14;
          if (_cursor.isNull(_cursorIndexOfData_14)) {
            _tmpData_14 = null;
          } else {
            _tmpData_14 = _cursor.getString(_cursorIndexOfData_14);
          }
          _tmpAlternatePhone.setData(_tmpData_14);
          final Integer _tmpStatus_15;
          if (_cursor.isNull(_cursorIndexOfStatus_15)) {
            _tmpStatus_15 = null;
          } else {
            _tmpStatus_15 = _cursor.getInt(_cursorIndexOfStatus_15);
          }
          _tmpAlternatePhone.setStatus(_tmpStatus_15);
        }  else  {
          _tmpAlternatePhone = null;
        }
        final Location _tmpLocation;
        if (! (_cursor.isNull(_cursorIndexOfCoordinates))) {
          _tmpLocation = new Location();
          final List<Double> _tmpCoordinates;
          final String _tmp_9;
          if (_cursor.isNull(_cursorIndexOfCoordinates)) {
            _tmp_9 = null;
          } else {
            _tmp_9 = _cursor.getString(_cursorIndexOfCoordinates);
          }
          _tmpCoordinates = DoubleTypeConverters.stringToDoubleList(_tmp_9);
          _tmpLocation.setCoordinates(_tmpCoordinates);
        }  else  {
          _tmpLocation = null;
        }
        final Startup _tmpStartup;
        if (! (_cursor.isNull(_cursorIndexOfNearByRadius) && _cursor.isNull(_cursorIndexOfPurpose) && _cursor.isNull(_cursorIndexOfStatus_16) && _cursor.isNull(_cursorIndexOfWishlist))) {
          _tmpStartup = new Startup();
          final Integer _tmpNearByRadius;
          if (_cursor.isNull(_cursorIndexOfNearByRadius)) {
            _tmpNearByRadius = null;
          } else {
            _tmpNearByRadius = _cursor.getInt(_cursorIndexOfNearByRadius);
          }
          _tmpStartup.setNearByRadius(_tmpNearByRadius);
          final List<String> _tmpPurpose;
          final String _tmp_10;
          if (_cursor.isNull(_cursorIndexOfPurpose)) {
            _tmp_10 = null;
          } else {
            _tmp_10 = _cursor.getString(_cursorIndexOfPurpose);
          }
          _tmpPurpose = StringTypeConverters.stringToStringList(_tmp_10);
          _tmpStartup.setPurpose(_tmpPurpose);
          final int _tmpStatus_16;
          _tmpStatus_16 = _cursor.getInt(_cursorIndexOfStatus_16);
          _tmpStartup.setStatus(_tmpStatus_16);
          final String _tmpWishlist;
          if (_cursor.isNull(_cursorIndexOfWishlist)) {
            _tmpWishlist = null;
          } else {
            _tmpWishlist = _cursor.getString(_cursorIndexOfWishlist);
          }
          _tmpStartup.setWishlist(_tmpWishlist);
        }  else  {
          _tmpStartup = null;
        }
        final DataObject _tmpCompanyName;
        if (! (_cursor.isNull(_cursorIndexOfData_15) && _cursor.isNull(_cursorIndexOfStatus_17))) {
          _tmpCompanyName = new DataObject();
          final String _tmpData_15;
          if (_cursor.isNull(_cursorIndexOfData_15)) {
            _tmpData_15 = null;
          } else {
            _tmpData_15 = _cursor.getString(_cursorIndexOfData_15);
          }
          _tmpCompanyName.setData(_tmpData_15);
          final Integer _tmpStatus_17;
          if (_cursor.isNull(_cursorIndexOfStatus_17)) {
            _tmpStatus_17 = null;
          } else {
            _tmpStatus_17 = _cursor.getInt(_cursorIndexOfStatus_17);
          }
          _tmpCompanyName.setStatus(_tmpStatus_17);
        }  else  {
          _tmpCompanyName = null;
        }
        final DataObject _tmpProfession;
        if (! (_cursor.isNull(_cursorIndexOfData_16) && _cursor.isNull(_cursorIndexOfStatus_18))) {
          _tmpProfession = new DataObject();
          final String _tmpData_16;
          if (_cursor.isNull(_cursorIndexOfData_16)) {
            _tmpData_16 = null;
          } else {
            _tmpData_16 = _cursor.getString(_cursorIndexOfData_16);
          }
          _tmpProfession.setData(_tmpData_16);
          final Integer _tmpStatus_18;
          if (_cursor.isNull(_cursorIndexOfStatus_18)) {
            _tmpStatus_18 = null;
          } else {
            _tmpStatus_18 = _cursor.getInt(_cursorIndexOfStatus_18);
          }
          _tmpProfession.setStatus(_tmpStatus_18);
        }  else  {
          _tmpProfession = null;
        }
        final DataObject _tmpCategory;
        if (! (_cursor.isNull(_cursorIndexOfData_17) && _cursor.isNull(_cursorIndexOfStatus_19))) {
          _tmpCategory = new DataObject();
          final String _tmpData_17;
          if (_cursor.isNull(_cursorIndexOfData_17)) {
            _tmpData_17 = null;
          } else {
            _tmpData_17 = _cursor.getString(_cursorIndexOfData_17);
          }
          _tmpCategory.setData(_tmpData_17);
          final Integer _tmpStatus_19;
          if (_cursor.isNull(_cursorIndexOfStatus_19)) {
            _tmpStatus_19 = null;
          } else {
            _tmpStatus_19 = _cursor.getInt(_cursorIndexOfStatus_19);
          }
          _tmpCategory.setStatus(_tmpStatus_19);
        }  else  {
          _tmpCategory = null;
        }
        final DataObject _tmpYearsOfEstablish;
        if (! (_cursor.isNull(_cursorIndexOfData_18) && _cursor.isNull(_cursorIndexOfStatus_20))) {
          _tmpYearsOfEstablish = new DataObject();
          final String _tmpData_18;
          if (_cursor.isNull(_cursorIndexOfData_18)) {
            _tmpData_18 = null;
          } else {
            _tmpData_18 = _cursor.getString(_cursorIndexOfData_18);
          }
          _tmpYearsOfEstablish.setData(_tmpData_18);
          final Integer _tmpStatus_20;
          if (_cursor.isNull(_cursorIndexOfStatus_20)) {
            _tmpStatus_20 = null;
          } else {
            _tmpStatus_20 = _cursor.getInt(_cursorIndexOfStatus_20);
          }
          _tmpYearsOfEstablish.setStatus(_tmpStatus_20);
        }  else  {
          _tmpYearsOfEstablish = null;
        }
        final DataObject _tmpYearsOfExperience;
        if (! (_cursor.isNull(_cursorIndexOfData_19) && _cursor.isNull(_cursorIndexOfStatus_21))) {
          _tmpYearsOfExperience = new DataObject();
          final String _tmpData_19;
          if (_cursor.isNull(_cursorIndexOfData_19)) {
            _tmpData_19 = null;
          } else {
            _tmpData_19 = _cursor.getString(_cursorIndexOfData_19);
          }
          _tmpYearsOfExperience.setData(_tmpData_19);
          final Integer _tmpStatus_21;
          if (_cursor.isNull(_cursorIndexOfStatus_21)) {
            _tmpStatus_21 = null;
          } else {
            _tmpStatus_21 = _cursor.getInt(_cursorIndexOfStatus_21);
          }
          _tmpYearsOfExperience.setStatus(_tmpStatus_21);
        }  else  {
          _tmpYearsOfExperience = null;
        }
        final DataObject _tmpWebsite;
        if (! (_cursor.isNull(_cursorIndexOfData_20) && _cursor.isNull(_cursorIndexOfStatus_22))) {
          _tmpWebsite = new DataObject();
          final String _tmpData_20;
          if (_cursor.isNull(_cursorIndexOfData_20)) {
            _tmpData_20 = null;
          } else {
            _tmpData_20 = _cursor.getString(_cursorIndexOfData_20);
          }
          _tmpWebsite.setData(_tmpData_20);
          final Integer _tmpStatus_22;
          if (_cursor.isNull(_cursorIndexOfStatus_22)) {
            _tmpStatus_22 = null;
          } else {
            _tmpStatus_22 = _cursor.getInt(_cursorIndexOfStatus_22);
          }
          _tmpWebsite.setStatus(_tmpStatus_22);
        }  else  {
          _tmpWebsite = null;
        }
        final Visibility _tmpVisibility;
        if (! (_cursor.isNull(_cursorIndexOfDob_1) && _cursor.isNull(_cursorIndexOfProfilePic))) {
          _tmpVisibility = new Visibility();
          final Integer _tmpDob;
          if (_cursor.isNull(_cursorIndexOfDob_1)) {
            _tmpDob = null;
          } else {
            _tmpDob = _cursor.getInt(_cursorIndexOfDob_1);
          }
          _tmpVisibility.setDob(_tmpDob);
          final Integer _tmpProfilePic;
          if (_cursor.isNull(_cursorIndexOfProfilePic)) {
            _tmpProfilePic = null;
          } else {
            _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
          }
          _tmpVisibility.setProfilePic(_tmpProfilePic);
        }  else  {
          _tmpVisibility = null;
        }
        _item = new GetGeneralProfile();
        final String _tmpCountryCode;
        if (_cursor.isNull(_cursorIndexOfCountryCode)) {
          _tmpCountryCode = null;
        } else {
          _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
        }
        _item.setCountryCode(_tmpCountryCode);
        final Integer _tmpIsVerified;
        if (_cursor.isNull(_cursorIndexOfIsVerified)) {
          _tmpIsVerified = null;
        } else {
          _tmpIsVerified = _cursor.getInt(_cursorIndexOfIsVerified);
        }
        _item.setIsVerified(_tmpIsVerified);
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpNetclanId;
        if (_cursor.isNull(_cursorIndexOfNetclanId)) {
          _tmpNetclanId = null;
        } else {
          _tmpNetclanId = _cursor.getString(_cursorIndexOfNetclanId);
        }
        _item.setNetclanId(_tmpNetclanId);
        final long _tmpPhone;
        _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
        _item.setPhone(_tmpPhone);
        final Integer _tmpPhoneStatus;
        if (_cursor.isNull(_cursorIndexOfPhoneStatus)) {
          _tmpPhoneStatus = null;
        } else {
          _tmpPhoneStatus = _cursor.getInt(_cursorIndexOfPhoneStatus);
        }
        _item.setPhoneStatus(_tmpPhoneStatus);
        final Integer _tmpLoginVia;
        if (_cursor.isNull(_cursorIndexOfLoginVia)) {
          _tmpLoginVia = null;
        } else {
          _tmpLoginVia = _cursor.getInt(_cursorIndexOfLoginVia);
        }
        _item.setLoginVia(_tmpLoginVia);
        final Integer _tmpV;
        if (_cursor.isNull(_cursorIndexOfV)) {
          _tmpV = null;
        } else {
          _tmpV = _cursor.getInt(_cursorIndexOfV);
        }
        _item.setV(_tmpV);
        final String _tmpFullName;
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _tmpFullName = null;
        } else {
          _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
        }
        _item.setFullName(_tmpFullName);
        final String _tmpFirstName;
        if (_cursor.isNull(_cursorIndexOfFirstName)) {
          _tmpFirstName = null;
        } else {
          _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        }
        _item.setFirstName(_tmpFirstName);
        final String _tmpLastName;
        if (_cursor.isNull(_cursorIndexOfLastName)) {
          _tmpLastName = null;
        } else {
          _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
        }
        _item.setLastName(_tmpLastName);
        final int _tmpGender;
        _tmpGender = _cursor.getInt(_cursorIndexOfGender);
        _item.setGender(_tmpGender);
        final String _tmpMerchantName;
        if (_cursor.isNull(_cursorIndexOfMerchantName)) {
          _tmpMerchantName = null;
        } else {
          _tmpMerchantName = _cursor.getString(_cursorIndexOfMerchantName);
        }
        _item.setMerchantName(_tmpMerchantName);
        final Integer _tmpUserType;
        if (_cursor.isNull(_cursorIndexOfUserType)) {
          _tmpUserType = null;
        } else {
          _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
        }
        _item.setUserType(_tmpUserType);
        final String _tmpPincode;
        if (_cursor.isNull(_cursorIndexOfPincode)) {
          _tmpPincode = null;
        } else {
          _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
        }
        _item.setPincode(_tmpPincode);
        final String _tmpProfilePicUrl;
        if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
          _tmpProfilePicUrl = null;
        } else {
          _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
        }
        _item.setProfilePicUrl(_tmpProfilePicUrl);
        final int _tmpProfileScore;
        _tmpProfileScore = _cursor.getInt(_cursorIndexOfProfileScore);
        _item.setProfileScore(_tmpProfileScore);
        final Boolean _tmpIsNewUser;
        final Integer _tmp_11;
        if (_cursor.isNull(_cursorIndexOfIsNewUser)) {
          _tmp_11 = null;
        } else {
          _tmp_11 = _cursor.getInt(_cursorIndexOfIsNewUser);
        }
        _tmpIsNewUser = _tmp_11 == null ? null : _tmp_11 != 0;
        _item.setNewUser(_tmpIsNewUser);
        final String _tmpDob_1;
        if (_cursor.isNull(_cursorIndexOfDob)) {
          _tmpDob_1 = null;
        } else {
          _tmpDob_1 = _cursor.getString(_cursorIndexOfDob);
        }
        _item.setDob(_tmpDob_1);
        final int _tmpInvStatus;
        _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
        _item.setInvStatus(_tmpInvStatus);
        final String _tmpServiceType;
        if (_cursor.isNull(_cursorIndexOfServiceType)) {
          _tmpServiceType = null;
        } else {
          _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
        }
        _item.setServiceType(_tmpServiceType);
        final String _tmpServiceName;
        if (_cursor.isNull(_cursorIndexOfServiceName)) {
          _tmpServiceName = null;
        } else {
          _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
        }
        _item.setServiceName(_tmpServiceName);
        final String _tmpLastSyncDate;
        if (_cursor.isNull(_cursorIndexOfLastSyncDate)) {
          _tmpLastSyncDate = null;
        } else {
          _tmpLastSyncDate = _cursor.getString(_cursorIndexOfLastSyncDate);
        }
        _item.setLastSyncDate(_tmpLastSyncDate);
        final String _tmpModifiedDate;
        if (_cursor.isNull(_cursorIndexOfModifiedDate)) {
          _tmpModifiedDate = null;
        } else {
          _tmpModifiedDate = _cursor.getString(_cursorIndexOfModifiedDate);
        }
        _item.setModifiedDate(_tmpModifiedDate);
        final String _tmpFullPhone;
        if (_cursor.isNull(_cursorIndexOfFullPhone)) {
          _tmpFullPhone = null;
        } else {
          _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
        }
        _item.setFullPhone(_tmpFullPhone);
        _item.setBio(_tmpBio);
        _item.setPlaceList(_tmpPlaceList);
        _item.setSocialList(_tmpSocialList);
        _item.setEducationList(_tmpEducationList);
        _item.setProfessionalList(_tmpProfessionalList);
        _item.setHobbies(_tmpHobbies);
        _item.setMovies(_tmpMovies);
        _item.setSports(_tmpSports);
        _item.setFoodPreferences(_tmpFoodPreferences);
        _item.setOtherPreferences(_tmpOtherPreferences);
        _item.setEmergencyDetails(_tmpEmergencyDetails);
        _item.setEmail(_tmpEmail);
        _item.setOfficeEmail(_tmpOfficeEmail);
        _item.setAlternateEmail(_tmpAlternateEmail);
        _item.setOfficePhone(_tmpOfficePhone);
        _item.setAlternatePhone(_tmpAlternatePhone);
        _item.setLocation(_tmpLocation);
        _item.setStartup(_tmpStartup);
        _item.setCompanyName(_tmpCompanyName);
        _item.setProfession(_tmpProfession);
        _item.setCategory(_tmpCategory);
        _item.setYearsOfEstablish(_tmpYearsOfEstablish);
        _item.setYearsOfExperience(_tmpYearsOfExperience);
        _item.setWebsite(_tmpWebsite);
        _item.setVisibility(_tmpVisibility);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<GetGeneralProfile>> getConnectionsProfessional() {
    final String _sql = "select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 1 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"profile","connection_table","contacts_table"}, false, new Callable<List<GetGeneralProfile>>() {
      @Override
      public List<GetGeneralProfile> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
          final int _cursorIndexOfIsVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "isVerified");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfNetclanId = CursorUtil.getColumnIndexOrThrow(_cursor, "netClanId");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPhoneStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneStatus");
          final int _cursorIndexOfLoginVia = CursorUtil.getColumnIndexOrThrow(_cursor, "loginVia");
          final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "v_");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfMerchantName = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantName");
          final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType_");
          final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
          final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
          final int _cursorIndexOfProfileScore = CursorUtil.getColumnIndexOrThrow(_cursor, "profileScore");
          final int _cursorIndexOfIsNewUser = CursorUtil.getColumnIndexOrThrow(_cursor, "isNewUser");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
          final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
          final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceName");
          final int _cursorIndexOfLastSyncDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSyncDate");
          final int _cursorIndexOfModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedDate");
          final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_data");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_status");
          final int _cursorIndexOfData_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_data");
          final int _cursorIndexOfStatus_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_status");
          final int _cursorIndexOfData_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_data");
          final int _cursorIndexOfStatus_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_status");
          final int _cursorIndexOfStatus_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_status");
          final int _cursorIndexOfData_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_data");
          final int _cursorIndexOfData_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_data");
          final int _cursorIndexOfStatus_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_status");
          final int _cursorIndexOfData_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_data");
          final int _cursorIndexOfStatus_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_status");
          final int _cursorIndexOfData_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_data");
          final int _cursorIndexOfStatus_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_status");
          final int _cursorIndexOfData_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_data");
          final int _cursorIndexOfStatus_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_status");
          final int _cursorIndexOfData_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_data");
          final int _cursorIndexOfStatus_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_status");
          final int _cursorIndexOfData_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_data");
          final int _cursorIndexOfStatus_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_status");
          final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_bloodGroup");
          final int _cursorIndexOfDoctorContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_doctorContact");
          final int _cursorIndexOfInsuranceAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceAgent");
          final int _cursorIndexOfInsuranceContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceContact");
          final int _cursorIndexOfEmergencyContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_emergencyContact");
          final int _cursorIndexOfStatus_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_status");
          final int _cursorIndexOfData_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_data");
          final int _cursorIndexOfStatus_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_status");
          final int _cursorIndexOfData_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_data");
          final int _cursorIndexOfStatus_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_status");
          final int _cursorIndexOfData_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_data");
          final int _cursorIndexOfStatus_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_status");
          final int _cursorIndexOfData_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_data");
          final int _cursorIndexOfStatus_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_status");
          final int _cursorIndexOfData_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_data");
          final int _cursorIndexOfStatus_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_status");
          final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "location_coordinates");
          final int _cursorIndexOfNearByRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_nearByRadius");
          final int _cursorIndexOfPurpose = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_purpose");
          final int _cursorIndexOfStatus_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_status");
          final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_wishlist");
          final int _cursorIndexOfData_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_data");
          final int _cursorIndexOfStatus_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_status");
          final int _cursorIndexOfData_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_data");
          final int _cursorIndexOfStatus_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_status");
          final int _cursorIndexOfData_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_data");
          final int _cursorIndexOfStatus_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_status");
          final int _cursorIndexOfData_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_data");
          final int _cursorIndexOfStatus_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_status");
          final int _cursorIndexOfData_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_data");
          final int _cursorIndexOfStatus_21 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_status");
          final int _cursorIndexOfData_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_data");
          final int _cursorIndexOfStatus_22 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_status");
          final int _cursorIndexOfDob_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_dob_status");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_profilePic_status");
          final List<GetGeneralProfile> _result = new ArrayList<GetGeneralProfile>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GetGeneralProfile _item;
            final Bio _tmpBio;
            if (! (_cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus))) {
              _tmpBio = new Bio();
              final String _tmpData;
              if (_cursor.isNull(_cursorIndexOfData)) {
                _tmpData = null;
              } else {
                _tmpData = _cursor.getString(_cursorIndexOfData);
              }
              _tmpBio.setData(_tmpData);
              final Integer _tmpStatus;
              if (_cursor.isNull(_cursorIndexOfStatus)) {
                _tmpStatus = null;
              } else {
                _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
              }
              _tmpBio.setStatus(_tmpStatus);
            }  else  {
              _tmpBio = null;
            }
            final PlaceList _tmpPlaceList;
            if (! (_cursor.isNull(_cursorIndexOfData_1) && _cursor.isNull(_cursorIndexOfStatus_1))) {
              _tmpPlaceList = new PlaceList();
              final List<PlaceItem> _tmpData_1;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfData_1)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfData_1);
              }
              _tmpData_1 = PlaceItemTypeConverters.stringToPlaceItemsList(_tmp);
              _tmpPlaceList.setData(_tmpData_1);
              final Integer _tmpStatus_1;
              if (_cursor.isNull(_cursorIndexOfStatus_1)) {
                _tmpStatus_1 = null;
              } else {
                _tmpStatus_1 = _cursor.getInt(_cursorIndexOfStatus_1);
              }
              _tmpPlaceList.setStatus(_tmpStatus_1);
            }  else  {
              _tmpPlaceList = null;
            }
            final SocialList _tmpSocialList;
            if (! (_cursor.isNull(_cursorIndexOfData_2) && _cursor.isNull(_cursorIndexOfStatus_2))) {
              _tmpSocialList = new SocialList();
              final List<SocialItem> _tmpData_2;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfData_2)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfData_2);
              }
              _tmpData_2 = SocialItemTypeConverters.stringToSocialItemsList(_tmp_1);
              _tmpSocialList.setData(_tmpData_2);
              final Integer _tmpStatus_2;
              if (_cursor.isNull(_cursorIndexOfStatus_2)) {
                _tmpStatus_2 = null;
              } else {
                _tmpStatus_2 = _cursor.getInt(_cursorIndexOfStatus_2);
              }
              _tmpSocialList.setStatus(_tmpStatus_2);
            }  else  {
              _tmpSocialList = null;
            }
            final EducationList _tmpEducationList;
            if (! (_cursor.isNull(_cursorIndexOfStatus_3) && _cursor.isNull(_cursorIndexOfData_3))) {
              _tmpEducationList = new EducationList();
              final Integer _tmpStatus_3;
              if (_cursor.isNull(_cursorIndexOfStatus_3)) {
                _tmpStatus_3 = null;
              } else {
                _tmpStatus_3 = _cursor.getInt(_cursorIndexOfStatus_3);
              }
              _tmpEducationList.setStatus(_tmpStatus_3);
              final List<EducationItem> _tmpData_3;
              final String _tmp_2;
              if (_cursor.isNull(_cursorIndexOfData_3)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getString(_cursorIndexOfData_3);
              }
              _tmpData_3 = EducationItemTypeConverters.stringToEducationItemsList(_tmp_2);
              _tmpEducationList.setData(_tmpData_3);
            }  else  {
              _tmpEducationList = null;
            }
            final ProfessionalList _tmpProfessionalList;
            if (! (_cursor.isNull(_cursorIndexOfData_4) && _cursor.isNull(_cursorIndexOfStatus_4))) {
              _tmpProfessionalList = new ProfessionalList();
              final List<ProfessionItem> _tmpData_4;
              final String _tmp_3;
              if (_cursor.isNull(_cursorIndexOfData_4)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getString(_cursorIndexOfData_4);
              }
              _tmpData_4 = ProfessionalItemTypeConverters.stringToProfessionItemsList(_tmp_3);
              _tmpProfessionalList.setData(_tmpData_4);
              final Integer _tmpStatus_4;
              if (_cursor.isNull(_cursorIndexOfStatus_4)) {
                _tmpStatus_4 = null;
              } else {
                _tmpStatus_4 = _cursor.getInt(_cursorIndexOfStatus_4);
              }
              _tmpProfessionalList.setStatus(_tmpStatus_4);
            }  else  {
              _tmpProfessionalList = null;
            }
            final PersonalPreferences _tmpHobbies;
            if (! (_cursor.isNull(_cursorIndexOfData_5) && _cursor.isNull(_cursorIndexOfStatus_5))) {
              _tmpHobbies = new PersonalPreferences();
              final List<String> _tmpData_5;
              final String _tmp_4;
              if (_cursor.isNull(_cursorIndexOfData_5)) {
                _tmp_4 = null;
              } else {
                _tmp_4 = _cursor.getString(_cursorIndexOfData_5);
              }
              _tmpData_5 = StringTypeConverters.stringToStringList(_tmp_4);
              _tmpHobbies.setData(_tmpData_5);
              final Integer _tmpStatus_5;
              if (_cursor.isNull(_cursorIndexOfStatus_5)) {
                _tmpStatus_5 = null;
              } else {
                _tmpStatus_5 = _cursor.getInt(_cursorIndexOfStatus_5);
              }
              _tmpHobbies.setStatus(_tmpStatus_5);
            }  else  {
              _tmpHobbies = null;
            }
            final PersonalPreferences _tmpMovies;
            if (! (_cursor.isNull(_cursorIndexOfData_6) && _cursor.isNull(_cursorIndexOfStatus_6))) {
              _tmpMovies = new PersonalPreferences();
              final List<String> _tmpData_6;
              final String _tmp_5;
              if (_cursor.isNull(_cursorIndexOfData_6)) {
                _tmp_5 = null;
              } else {
                _tmp_5 = _cursor.getString(_cursorIndexOfData_6);
              }
              _tmpData_6 = StringTypeConverters.stringToStringList(_tmp_5);
              _tmpMovies.setData(_tmpData_6);
              final Integer _tmpStatus_6;
              if (_cursor.isNull(_cursorIndexOfStatus_6)) {
                _tmpStatus_6 = null;
              } else {
                _tmpStatus_6 = _cursor.getInt(_cursorIndexOfStatus_6);
              }
              _tmpMovies.setStatus(_tmpStatus_6);
            }  else  {
              _tmpMovies = null;
            }
            final PersonalPreferences _tmpSports;
            if (! (_cursor.isNull(_cursorIndexOfData_7) && _cursor.isNull(_cursorIndexOfStatus_7))) {
              _tmpSports = new PersonalPreferences();
              final List<String> _tmpData_7;
              final String _tmp_6;
              if (_cursor.isNull(_cursorIndexOfData_7)) {
                _tmp_6 = null;
              } else {
                _tmp_6 = _cursor.getString(_cursorIndexOfData_7);
              }
              _tmpData_7 = StringTypeConverters.stringToStringList(_tmp_6);
              _tmpSports.setData(_tmpData_7);
              final Integer _tmpStatus_7;
              if (_cursor.isNull(_cursorIndexOfStatus_7)) {
                _tmpStatus_7 = null;
              } else {
                _tmpStatus_7 = _cursor.getInt(_cursorIndexOfStatus_7);
              }
              _tmpSports.setStatus(_tmpStatus_7);
            }  else  {
              _tmpSports = null;
            }
            final PersonalPreferences _tmpFoodPreferences;
            if (! (_cursor.isNull(_cursorIndexOfData_8) && _cursor.isNull(_cursorIndexOfStatus_8))) {
              _tmpFoodPreferences = new PersonalPreferences();
              final List<String> _tmpData_8;
              final String _tmp_7;
              if (_cursor.isNull(_cursorIndexOfData_8)) {
                _tmp_7 = null;
              } else {
                _tmp_7 = _cursor.getString(_cursorIndexOfData_8);
              }
              _tmpData_8 = StringTypeConverters.stringToStringList(_tmp_7);
              _tmpFoodPreferences.setData(_tmpData_8);
              final Integer _tmpStatus_8;
              if (_cursor.isNull(_cursorIndexOfStatus_8)) {
                _tmpStatus_8 = null;
              } else {
                _tmpStatus_8 = _cursor.getInt(_cursorIndexOfStatus_8);
              }
              _tmpFoodPreferences.setStatus(_tmpStatus_8);
            }  else  {
              _tmpFoodPreferences = null;
            }
            final PersonalPreferences _tmpOtherPreferences;
            if (! (_cursor.isNull(_cursorIndexOfData_9) && _cursor.isNull(_cursorIndexOfStatus_9))) {
              _tmpOtherPreferences = new PersonalPreferences();
              final List<String> _tmpData_9;
              final String _tmp_8;
              if (_cursor.isNull(_cursorIndexOfData_9)) {
                _tmp_8 = null;
              } else {
                _tmp_8 = _cursor.getString(_cursorIndexOfData_9);
              }
              _tmpData_9 = StringTypeConverters.stringToStringList(_tmp_8);
              _tmpOtherPreferences.setData(_tmpData_9);
              final Integer _tmpStatus_9;
              if (_cursor.isNull(_cursorIndexOfStatus_9)) {
                _tmpStatus_9 = null;
              } else {
                _tmpStatus_9 = _cursor.getInt(_cursorIndexOfStatus_9);
              }
              _tmpOtherPreferences.setStatus(_tmpStatus_9);
            }  else  {
              _tmpOtherPreferences = null;
            }
            final EmergencyDetails _tmpEmergencyDetails;
            if (! (_cursor.isNull(_cursorIndexOfBloodGroup) && _cursor.isNull(_cursorIndexOfDoctorContact) && _cursor.isNull(_cursorIndexOfInsuranceAgent) && _cursor.isNull(_cursorIndexOfInsuranceContact) && _cursor.isNull(_cursorIndexOfEmergencyContact) && _cursor.isNull(_cursorIndexOfStatus_10))) {
              _tmpEmergencyDetails = new EmergencyDetails();
              final String _tmpBloodGroup;
              if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
                _tmpBloodGroup = null;
              } else {
                _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
              }
              _tmpEmergencyDetails.setBloodGroup(_tmpBloodGroup);
              final String _tmpDoctorContact;
              if (_cursor.isNull(_cursorIndexOfDoctorContact)) {
                _tmpDoctorContact = null;
              } else {
                _tmpDoctorContact = _cursor.getString(_cursorIndexOfDoctorContact);
              }
              _tmpEmergencyDetails.setDoctorContact(_tmpDoctorContact);
              final String _tmpInsuranceAgent;
              if (_cursor.isNull(_cursorIndexOfInsuranceAgent)) {
                _tmpInsuranceAgent = null;
              } else {
                _tmpInsuranceAgent = _cursor.getString(_cursorIndexOfInsuranceAgent);
              }
              _tmpEmergencyDetails.setInsuranceAgent(_tmpInsuranceAgent);
              final String _tmpInsuranceContact;
              if (_cursor.isNull(_cursorIndexOfInsuranceContact)) {
                _tmpInsuranceContact = null;
              } else {
                _tmpInsuranceContact = _cursor.getString(_cursorIndexOfInsuranceContact);
              }
              _tmpEmergencyDetails.setInsuranceContact(_tmpInsuranceContact);
              final String _tmpEmergencyContact;
              if (_cursor.isNull(_cursorIndexOfEmergencyContact)) {
                _tmpEmergencyContact = null;
              } else {
                _tmpEmergencyContact = _cursor.getString(_cursorIndexOfEmergencyContact);
              }
              _tmpEmergencyDetails.setEmergencyContact(_tmpEmergencyContact);
              final Integer _tmpStatus_10;
              if (_cursor.isNull(_cursorIndexOfStatus_10)) {
                _tmpStatus_10 = null;
              } else {
                _tmpStatus_10 = _cursor.getInt(_cursorIndexOfStatus_10);
              }
              _tmpEmergencyDetails.setStatus(_tmpStatus_10);
            }  else  {
              _tmpEmergencyDetails = null;
            }
            final DataObject _tmpEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_10) && _cursor.isNull(_cursorIndexOfStatus_11))) {
              _tmpEmail = new DataObject();
              final String _tmpData_10;
              if (_cursor.isNull(_cursorIndexOfData_10)) {
                _tmpData_10 = null;
              } else {
                _tmpData_10 = _cursor.getString(_cursorIndexOfData_10);
              }
              _tmpEmail.setData(_tmpData_10);
              final Integer _tmpStatus_11;
              if (_cursor.isNull(_cursorIndexOfStatus_11)) {
                _tmpStatus_11 = null;
              } else {
                _tmpStatus_11 = _cursor.getInt(_cursorIndexOfStatus_11);
              }
              _tmpEmail.setStatus(_tmpStatus_11);
            }  else  {
              _tmpEmail = null;
            }
            final DataObject _tmpOfficeEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_11) && _cursor.isNull(_cursorIndexOfStatus_12))) {
              _tmpOfficeEmail = new DataObject();
              final String _tmpData_11;
              if (_cursor.isNull(_cursorIndexOfData_11)) {
                _tmpData_11 = null;
              } else {
                _tmpData_11 = _cursor.getString(_cursorIndexOfData_11);
              }
              _tmpOfficeEmail.setData(_tmpData_11);
              final Integer _tmpStatus_12;
              if (_cursor.isNull(_cursorIndexOfStatus_12)) {
                _tmpStatus_12 = null;
              } else {
                _tmpStatus_12 = _cursor.getInt(_cursorIndexOfStatus_12);
              }
              _tmpOfficeEmail.setStatus(_tmpStatus_12);
            }  else  {
              _tmpOfficeEmail = null;
            }
            final DataObject _tmpAlternateEmail;
            if (! (_cursor.isNull(_cursorIndexOfData_12) && _cursor.isNull(_cursorIndexOfStatus_13))) {
              _tmpAlternateEmail = new DataObject();
              final String _tmpData_12;
              if (_cursor.isNull(_cursorIndexOfData_12)) {
                _tmpData_12 = null;
              } else {
                _tmpData_12 = _cursor.getString(_cursorIndexOfData_12);
              }
              _tmpAlternateEmail.setData(_tmpData_12);
              final Integer _tmpStatus_13;
              if (_cursor.isNull(_cursorIndexOfStatus_13)) {
                _tmpStatus_13 = null;
              } else {
                _tmpStatus_13 = _cursor.getInt(_cursorIndexOfStatus_13);
              }
              _tmpAlternateEmail.setStatus(_tmpStatus_13);
            }  else  {
              _tmpAlternateEmail = null;
            }
            final DataObject _tmpOfficePhone;
            if (! (_cursor.isNull(_cursorIndexOfData_13) && _cursor.isNull(_cursorIndexOfStatus_14))) {
              _tmpOfficePhone = new DataObject();
              final String _tmpData_13;
              if (_cursor.isNull(_cursorIndexOfData_13)) {
                _tmpData_13 = null;
              } else {
                _tmpData_13 = _cursor.getString(_cursorIndexOfData_13);
              }
              _tmpOfficePhone.setData(_tmpData_13);
              final Integer _tmpStatus_14;
              if (_cursor.isNull(_cursorIndexOfStatus_14)) {
                _tmpStatus_14 = null;
              } else {
                _tmpStatus_14 = _cursor.getInt(_cursorIndexOfStatus_14);
              }
              _tmpOfficePhone.setStatus(_tmpStatus_14);
            }  else  {
              _tmpOfficePhone = null;
            }
            final DataObject _tmpAlternatePhone;
            if (! (_cursor.isNull(_cursorIndexOfData_14) && _cursor.isNull(_cursorIndexOfStatus_15))) {
              _tmpAlternatePhone = new DataObject();
              final String _tmpData_14;
              if (_cursor.isNull(_cursorIndexOfData_14)) {
                _tmpData_14 = null;
              } else {
                _tmpData_14 = _cursor.getString(_cursorIndexOfData_14);
              }
              _tmpAlternatePhone.setData(_tmpData_14);
              final Integer _tmpStatus_15;
              if (_cursor.isNull(_cursorIndexOfStatus_15)) {
                _tmpStatus_15 = null;
              } else {
                _tmpStatus_15 = _cursor.getInt(_cursorIndexOfStatus_15);
              }
              _tmpAlternatePhone.setStatus(_tmpStatus_15);
            }  else  {
              _tmpAlternatePhone = null;
            }
            final Location _tmpLocation;
            if (! (_cursor.isNull(_cursorIndexOfCoordinates))) {
              _tmpLocation = new Location();
              final List<Double> _tmpCoordinates;
              final String _tmp_9;
              if (_cursor.isNull(_cursorIndexOfCoordinates)) {
                _tmp_9 = null;
              } else {
                _tmp_9 = _cursor.getString(_cursorIndexOfCoordinates);
              }
              _tmpCoordinates = DoubleTypeConverters.stringToDoubleList(_tmp_9);
              _tmpLocation.setCoordinates(_tmpCoordinates);
            }  else  {
              _tmpLocation = null;
            }
            final Startup _tmpStartup;
            if (! (_cursor.isNull(_cursorIndexOfNearByRadius) && _cursor.isNull(_cursorIndexOfPurpose) && _cursor.isNull(_cursorIndexOfStatus_16) && _cursor.isNull(_cursorIndexOfWishlist))) {
              _tmpStartup = new Startup();
              final Integer _tmpNearByRadius;
              if (_cursor.isNull(_cursorIndexOfNearByRadius)) {
                _tmpNearByRadius = null;
              } else {
                _tmpNearByRadius = _cursor.getInt(_cursorIndexOfNearByRadius);
              }
              _tmpStartup.setNearByRadius(_tmpNearByRadius);
              final List<String> _tmpPurpose;
              final String _tmp_10;
              if (_cursor.isNull(_cursorIndexOfPurpose)) {
                _tmp_10 = null;
              } else {
                _tmp_10 = _cursor.getString(_cursorIndexOfPurpose);
              }
              _tmpPurpose = StringTypeConverters.stringToStringList(_tmp_10);
              _tmpStartup.setPurpose(_tmpPurpose);
              final int _tmpStatus_16;
              _tmpStatus_16 = _cursor.getInt(_cursorIndexOfStatus_16);
              _tmpStartup.setStatus(_tmpStatus_16);
              final String _tmpWishlist;
              if (_cursor.isNull(_cursorIndexOfWishlist)) {
                _tmpWishlist = null;
              } else {
                _tmpWishlist = _cursor.getString(_cursorIndexOfWishlist);
              }
              _tmpStartup.setWishlist(_tmpWishlist);
            }  else  {
              _tmpStartup = null;
            }
            final DataObject _tmpCompanyName;
            if (! (_cursor.isNull(_cursorIndexOfData_15) && _cursor.isNull(_cursorIndexOfStatus_17))) {
              _tmpCompanyName = new DataObject();
              final String _tmpData_15;
              if (_cursor.isNull(_cursorIndexOfData_15)) {
                _tmpData_15 = null;
              } else {
                _tmpData_15 = _cursor.getString(_cursorIndexOfData_15);
              }
              _tmpCompanyName.setData(_tmpData_15);
              final Integer _tmpStatus_17;
              if (_cursor.isNull(_cursorIndexOfStatus_17)) {
                _tmpStatus_17 = null;
              } else {
                _tmpStatus_17 = _cursor.getInt(_cursorIndexOfStatus_17);
              }
              _tmpCompanyName.setStatus(_tmpStatus_17);
            }  else  {
              _tmpCompanyName = null;
            }
            final DataObject _tmpProfession;
            if (! (_cursor.isNull(_cursorIndexOfData_16) && _cursor.isNull(_cursorIndexOfStatus_18))) {
              _tmpProfession = new DataObject();
              final String _tmpData_16;
              if (_cursor.isNull(_cursorIndexOfData_16)) {
                _tmpData_16 = null;
              } else {
                _tmpData_16 = _cursor.getString(_cursorIndexOfData_16);
              }
              _tmpProfession.setData(_tmpData_16);
              final Integer _tmpStatus_18;
              if (_cursor.isNull(_cursorIndexOfStatus_18)) {
                _tmpStatus_18 = null;
              } else {
                _tmpStatus_18 = _cursor.getInt(_cursorIndexOfStatus_18);
              }
              _tmpProfession.setStatus(_tmpStatus_18);
            }  else  {
              _tmpProfession = null;
            }
            final DataObject _tmpCategory;
            if (! (_cursor.isNull(_cursorIndexOfData_17) && _cursor.isNull(_cursorIndexOfStatus_19))) {
              _tmpCategory = new DataObject();
              final String _tmpData_17;
              if (_cursor.isNull(_cursorIndexOfData_17)) {
                _tmpData_17 = null;
              } else {
                _tmpData_17 = _cursor.getString(_cursorIndexOfData_17);
              }
              _tmpCategory.setData(_tmpData_17);
              final Integer _tmpStatus_19;
              if (_cursor.isNull(_cursorIndexOfStatus_19)) {
                _tmpStatus_19 = null;
              } else {
                _tmpStatus_19 = _cursor.getInt(_cursorIndexOfStatus_19);
              }
              _tmpCategory.setStatus(_tmpStatus_19);
            }  else  {
              _tmpCategory = null;
            }
            final DataObject _tmpYearsOfEstablish;
            if (! (_cursor.isNull(_cursorIndexOfData_18) && _cursor.isNull(_cursorIndexOfStatus_20))) {
              _tmpYearsOfEstablish = new DataObject();
              final String _tmpData_18;
              if (_cursor.isNull(_cursorIndexOfData_18)) {
                _tmpData_18 = null;
              } else {
                _tmpData_18 = _cursor.getString(_cursorIndexOfData_18);
              }
              _tmpYearsOfEstablish.setData(_tmpData_18);
              final Integer _tmpStatus_20;
              if (_cursor.isNull(_cursorIndexOfStatus_20)) {
                _tmpStatus_20 = null;
              } else {
                _tmpStatus_20 = _cursor.getInt(_cursorIndexOfStatus_20);
              }
              _tmpYearsOfEstablish.setStatus(_tmpStatus_20);
            }  else  {
              _tmpYearsOfEstablish = null;
            }
            final DataObject _tmpYearsOfExperience;
            if (! (_cursor.isNull(_cursorIndexOfData_19) && _cursor.isNull(_cursorIndexOfStatus_21))) {
              _tmpYearsOfExperience = new DataObject();
              final String _tmpData_19;
              if (_cursor.isNull(_cursorIndexOfData_19)) {
                _tmpData_19 = null;
              } else {
                _tmpData_19 = _cursor.getString(_cursorIndexOfData_19);
              }
              _tmpYearsOfExperience.setData(_tmpData_19);
              final Integer _tmpStatus_21;
              if (_cursor.isNull(_cursorIndexOfStatus_21)) {
                _tmpStatus_21 = null;
              } else {
                _tmpStatus_21 = _cursor.getInt(_cursorIndexOfStatus_21);
              }
              _tmpYearsOfExperience.setStatus(_tmpStatus_21);
            }  else  {
              _tmpYearsOfExperience = null;
            }
            final DataObject _tmpWebsite;
            if (! (_cursor.isNull(_cursorIndexOfData_20) && _cursor.isNull(_cursorIndexOfStatus_22))) {
              _tmpWebsite = new DataObject();
              final String _tmpData_20;
              if (_cursor.isNull(_cursorIndexOfData_20)) {
                _tmpData_20 = null;
              } else {
                _tmpData_20 = _cursor.getString(_cursorIndexOfData_20);
              }
              _tmpWebsite.setData(_tmpData_20);
              final Integer _tmpStatus_22;
              if (_cursor.isNull(_cursorIndexOfStatus_22)) {
                _tmpStatus_22 = null;
              } else {
                _tmpStatus_22 = _cursor.getInt(_cursorIndexOfStatus_22);
              }
              _tmpWebsite.setStatus(_tmpStatus_22);
            }  else  {
              _tmpWebsite = null;
            }
            final Visibility _tmpVisibility;
            if (! (_cursor.isNull(_cursorIndexOfDob_1) && _cursor.isNull(_cursorIndexOfProfilePic))) {
              _tmpVisibility = new Visibility();
              final Integer _tmpDob;
              if (_cursor.isNull(_cursorIndexOfDob_1)) {
                _tmpDob = null;
              } else {
                _tmpDob = _cursor.getInt(_cursorIndexOfDob_1);
              }
              _tmpVisibility.setDob(_tmpDob);
              final Integer _tmpProfilePic;
              if (_cursor.isNull(_cursorIndexOfProfilePic)) {
                _tmpProfilePic = null;
              } else {
                _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
              }
              _tmpVisibility.setProfilePic(_tmpProfilePic);
            }  else  {
              _tmpVisibility = null;
            }
            _item = new GetGeneralProfile();
            final String _tmpCountryCode;
            if (_cursor.isNull(_cursorIndexOfCountryCode)) {
              _tmpCountryCode = null;
            } else {
              _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
            }
            _item.setCountryCode(_tmpCountryCode);
            final Integer _tmpIsVerified;
            if (_cursor.isNull(_cursorIndexOfIsVerified)) {
              _tmpIsVerified = null;
            } else {
              _tmpIsVerified = _cursor.getInt(_cursorIndexOfIsVerified);
            }
            _item.setIsVerified(_tmpIsVerified);
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpNetclanId;
            if (_cursor.isNull(_cursorIndexOfNetclanId)) {
              _tmpNetclanId = null;
            } else {
              _tmpNetclanId = _cursor.getString(_cursorIndexOfNetclanId);
            }
            _item.setNetclanId(_tmpNetclanId);
            final long _tmpPhone;
            _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
            _item.setPhone(_tmpPhone);
            final Integer _tmpPhoneStatus;
            if (_cursor.isNull(_cursorIndexOfPhoneStatus)) {
              _tmpPhoneStatus = null;
            } else {
              _tmpPhoneStatus = _cursor.getInt(_cursorIndexOfPhoneStatus);
            }
            _item.setPhoneStatus(_tmpPhoneStatus);
            final Integer _tmpLoginVia;
            if (_cursor.isNull(_cursorIndexOfLoginVia)) {
              _tmpLoginVia = null;
            } else {
              _tmpLoginVia = _cursor.getInt(_cursorIndexOfLoginVia);
            }
            _item.setLoginVia(_tmpLoginVia);
            final Integer _tmpV;
            if (_cursor.isNull(_cursorIndexOfV)) {
              _tmpV = null;
            } else {
              _tmpV = _cursor.getInt(_cursorIndexOfV);
            }
            _item.setV(_tmpV);
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            _item.setFullName(_tmpFullName);
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            _item.setFirstName(_tmpFirstName);
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            _item.setLastName(_tmpLastName);
            final int _tmpGender;
            _tmpGender = _cursor.getInt(_cursorIndexOfGender);
            _item.setGender(_tmpGender);
            final String _tmpMerchantName;
            if (_cursor.isNull(_cursorIndexOfMerchantName)) {
              _tmpMerchantName = null;
            } else {
              _tmpMerchantName = _cursor.getString(_cursorIndexOfMerchantName);
            }
            _item.setMerchantName(_tmpMerchantName);
            final Integer _tmpUserType;
            if (_cursor.isNull(_cursorIndexOfUserType)) {
              _tmpUserType = null;
            } else {
              _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
            }
            _item.setUserType(_tmpUserType);
            final String _tmpPincode;
            if (_cursor.isNull(_cursorIndexOfPincode)) {
              _tmpPincode = null;
            } else {
              _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
            }
            _item.setPincode(_tmpPincode);
            final String _tmpProfilePicUrl;
            if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
              _tmpProfilePicUrl = null;
            } else {
              _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
            }
            _item.setProfilePicUrl(_tmpProfilePicUrl);
            final int _tmpProfileScore;
            _tmpProfileScore = _cursor.getInt(_cursorIndexOfProfileScore);
            _item.setProfileScore(_tmpProfileScore);
            final Boolean _tmpIsNewUser;
            final Integer _tmp_11;
            if (_cursor.isNull(_cursorIndexOfIsNewUser)) {
              _tmp_11 = null;
            } else {
              _tmp_11 = _cursor.getInt(_cursorIndexOfIsNewUser);
            }
            _tmpIsNewUser = _tmp_11 == null ? null : _tmp_11 != 0;
            _item.setNewUser(_tmpIsNewUser);
            final String _tmpDob_1;
            if (_cursor.isNull(_cursorIndexOfDob)) {
              _tmpDob_1 = null;
            } else {
              _tmpDob_1 = _cursor.getString(_cursorIndexOfDob);
            }
            _item.setDob(_tmpDob_1);
            final int _tmpInvStatus;
            _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
            _item.setInvStatus(_tmpInvStatus);
            final String _tmpServiceType;
            if (_cursor.isNull(_cursorIndexOfServiceType)) {
              _tmpServiceType = null;
            } else {
              _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
            }
            _item.setServiceType(_tmpServiceType);
            final String _tmpServiceName;
            if (_cursor.isNull(_cursorIndexOfServiceName)) {
              _tmpServiceName = null;
            } else {
              _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
            }
            _item.setServiceName(_tmpServiceName);
            final String _tmpLastSyncDate;
            if (_cursor.isNull(_cursorIndexOfLastSyncDate)) {
              _tmpLastSyncDate = null;
            } else {
              _tmpLastSyncDate = _cursor.getString(_cursorIndexOfLastSyncDate);
            }
            _item.setLastSyncDate(_tmpLastSyncDate);
            final String _tmpModifiedDate;
            if (_cursor.isNull(_cursorIndexOfModifiedDate)) {
              _tmpModifiedDate = null;
            } else {
              _tmpModifiedDate = _cursor.getString(_cursorIndexOfModifiedDate);
            }
            _item.setModifiedDate(_tmpModifiedDate);
            final String _tmpFullPhone;
            if (_cursor.isNull(_cursorIndexOfFullPhone)) {
              _tmpFullPhone = null;
            } else {
              _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
            }
            _item.setFullPhone(_tmpFullPhone);
            _item.setBio(_tmpBio);
            _item.setPlaceList(_tmpPlaceList);
            _item.setSocialList(_tmpSocialList);
            _item.setEducationList(_tmpEducationList);
            _item.setProfessionalList(_tmpProfessionalList);
            _item.setHobbies(_tmpHobbies);
            _item.setMovies(_tmpMovies);
            _item.setSports(_tmpSports);
            _item.setFoodPreferences(_tmpFoodPreferences);
            _item.setOtherPreferences(_tmpOtherPreferences);
            _item.setEmergencyDetails(_tmpEmergencyDetails);
            _item.setEmail(_tmpEmail);
            _item.setOfficeEmail(_tmpOfficeEmail);
            _item.setAlternateEmail(_tmpAlternateEmail);
            _item.setOfficePhone(_tmpOfficePhone);
            _item.setAlternatePhone(_tmpAlternatePhone);
            _item.setLocation(_tmpLocation);
            _item.setStartup(_tmpStartup);
            _item.setCompanyName(_tmpCompanyName);
            _item.setProfession(_tmpProfession);
            _item.setCategory(_tmpCategory);
            _item.setYearsOfEstablish(_tmpYearsOfEstablish);
            _item.setYearsOfExperience(_tmpYearsOfExperience);
            _item.setWebsite(_tmpWebsite);
            _item.setVisibility(_tmpVisibility);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<GetGeneralProfile> getConnectionsListProfessional() {
    final String _sql = "select profile.* from profile inner join connection_table on profile._id = connection_table._id where inConnectionDataBase = 1 and userType_ = 1 union select profile.* from profile inner join contacts_table on profile._id = contacts_table._id where inContactsDataBase = 1 and userType_ = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
      final int _cursorIndexOfIsVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "isVerified");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfNetclanId = CursorUtil.getColumnIndexOrThrow(_cursor, "netClanId");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPhoneStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneStatus");
      final int _cursorIndexOfLoginVia = CursorUtil.getColumnIndexOrThrow(_cursor, "loginVia");
      final int _cursorIndexOfV = CursorUtil.getColumnIndexOrThrow(_cursor, "v_");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
      final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfMerchantName = CursorUtil.getColumnIndexOrThrow(_cursor, "merchantName");
      final int _cursorIndexOfUserType = CursorUtil.getColumnIndexOrThrow(_cursor, "userType_");
      final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
      final int _cursorIndexOfProfilePicUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePicUrl");
      final int _cursorIndexOfProfileScore = CursorUtil.getColumnIndexOrThrow(_cursor, "profileScore");
      final int _cursorIndexOfIsNewUser = CursorUtil.getColumnIndexOrThrow(_cursor, "isNewUser");
      final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
      final int _cursorIndexOfInvStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "invStatus");
      final int _cursorIndexOfServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceType");
      final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceName");
      final int _cursorIndexOfLastSyncDate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastSyncDate");
      final int _cursorIndexOfModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedDate");
      final int _cursorIndexOfFullPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "fullPhone");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_data");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "bio_status");
      final int _cursorIndexOfData_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_data");
      final int _cursorIndexOfStatus_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "places_status");
      final int _cursorIndexOfData_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_data");
      final int _cursorIndexOfStatus_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "socialMedia_status");
      final int _cursorIndexOfStatus_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_status");
      final int _cursorIndexOfData_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "education_data");
      final int _cursorIndexOfData_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_data");
      final int _cursorIndexOfStatus_4 = CursorUtil.getColumnIndexOrThrow(_cursor, "professional_status");
      final int _cursorIndexOfData_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_data");
      final int _cursorIndexOfStatus_5 = CursorUtil.getColumnIndexOrThrow(_cursor, "hobbies_status");
      final int _cursorIndexOfData_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_data");
      final int _cursorIndexOfStatus_6 = CursorUtil.getColumnIndexOrThrow(_cursor, "movies_status");
      final int _cursorIndexOfData_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_data");
      final int _cursorIndexOfStatus_7 = CursorUtil.getColumnIndexOrThrow(_cursor, "sports_status");
      final int _cursorIndexOfData_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_data");
      final int _cursorIndexOfStatus_8 = CursorUtil.getColumnIndexOrThrow(_cursor, "foodPreferences_status");
      final int _cursorIndexOfData_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_data");
      final int _cursorIndexOfStatus_9 = CursorUtil.getColumnIndexOrThrow(_cursor, "otherPreferences_status");
      final int _cursorIndexOfBloodGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_bloodGroup");
      final int _cursorIndexOfDoctorContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_doctorContact");
      final int _cursorIndexOfInsuranceAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceAgent");
      final int _cursorIndexOfInsuranceContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_insuranceContact");
      final int _cursorIndexOfEmergencyContact = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_emergencyContact");
      final int _cursorIndexOfStatus_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "emergencyDetails_status");
      final int _cursorIndexOfData_10 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_data");
      final int _cursorIndexOfStatus_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "email_status");
      final int _cursorIndexOfData_11 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_data");
      final int _cursorIndexOfStatus_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "officeEmail_status");
      final int _cursorIndexOfData_12 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_data");
      final int _cursorIndexOfStatus_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternateEmail_status");
      final int _cursorIndexOfData_13 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_data");
      final int _cursorIndexOfStatus_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "officePhone_status");
      final int _cursorIndexOfData_14 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_data");
      final int _cursorIndexOfStatus_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "alternatePhone_status");
      final int _cursorIndexOfCoordinates = CursorUtil.getColumnIndexOrThrow(_cursor, "location_coordinates");
      final int _cursorIndexOfNearByRadius = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_nearByRadius");
      final int _cursorIndexOfPurpose = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_purpose");
      final int _cursorIndexOfStatus_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_status");
      final int _cursorIndexOfWishlist = CursorUtil.getColumnIndexOrThrow(_cursor, "startup_wishlist");
      final int _cursorIndexOfData_15 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_data");
      final int _cursorIndexOfStatus_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName_status");
      final int _cursorIndexOfData_16 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_data");
      final int _cursorIndexOfStatus_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "profession_status");
      final int _cursorIndexOfData_17 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_data");
      final int _cursorIndexOfStatus_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "category_status");
      final int _cursorIndexOfData_18 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_data");
      final int _cursorIndexOfStatus_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfEstablish_status");
      final int _cursorIndexOfData_19 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_data");
      final int _cursorIndexOfStatus_21 = CursorUtil.getColumnIndexOrThrow(_cursor, "yearsOfExperience_status");
      final int _cursorIndexOfData_20 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_data");
      final int _cursorIndexOfStatus_22 = CursorUtil.getColumnIndexOrThrow(_cursor, "website_status");
      final int _cursorIndexOfDob_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_dob_status");
      final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility_profilePic_status");
      final List<GetGeneralProfile> _result = new ArrayList<GetGeneralProfile>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final GetGeneralProfile _item;
        final Bio _tmpBio;
        if (! (_cursor.isNull(_cursorIndexOfData) && _cursor.isNull(_cursorIndexOfStatus))) {
          _tmpBio = new Bio();
          final String _tmpData;
          if (_cursor.isNull(_cursorIndexOfData)) {
            _tmpData = null;
          } else {
            _tmpData = _cursor.getString(_cursorIndexOfData);
          }
          _tmpBio.setData(_tmpData);
          final Integer _tmpStatus;
          if (_cursor.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
          }
          _tmpBio.setStatus(_tmpStatus);
        }  else  {
          _tmpBio = null;
        }
        final PlaceList _tmpPlaceList;
        if (! (_cursor.isNull(_cursorIndexOfData_1) && _cursor.isNull(_cursorIndexOfStatus_1))) {
          _tmpPlaceList = new PlaceList();
          final List<PlaceItem> _tmpData_1;
          final String _tmp;
          if (_cursor.isNull(_cursorIndexOfData_1)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getString(_cursorIndexOfData_1);
          }
          _tmpData_1 = PlaceItemTypeConverters.stringToPlaceItemsList(_tmp);
          _tmpPlaceList.setData(_tmpData_1);
          final Integer _tmpStatus_1;
          if (_cursor.isNull(_cursorIndexOfStatus_1)) {
            _tmpStatus_1 = null;
          } else {
            _tmpStatus_1 = _cursor.getInt(_cursorIndexOfStatus_1);
          }
          _tmpPlaceList.setStatus(_tmpStatus_1);
        }  else  {
          _tmpPlaceList = null;
        }
        final SocialList _tmpSocialList;
        if (! (_cursor.isNull(_cursorIndexOfData_2) && _cursor.isNull(_cursorIndexOfStatus_2))) {
          _tmpSocialList = new SocialList();
          final List<SocialItem> _tmpData_2;
          final String _tmp_1;
          if (_cursor.isNull(_cursorIndexOfData_2)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getString(_cursorIndexOfData_2);
          }
          _tmpData_2 = SocialItemTypeConverters.stringToSocialItemsList(_tmp_1);
          _tmpSocialList.setData(_tmpData_2);
          final Integer _tmpStatus_2;
          if (_cursor.isNull(_cursorIndexOfStatus_2)) {
            _tmpStatus_2 = null;
          } else {
            _tmpStatus_2 = _cursor.getInt(_cursorIndexOfStatus_2);
          }
          _tmpSocialList.setStatus(_tmpStatus_2);
        }  else  {
          _tmpSocialList = null;
        }
        final EducationList _tmpEducationList;
        if (! (_cursor.isNull(_cursorIndexOfStatus_3) && _cursor.isNull(_cursorIndexOfData_3))) {
          _tmpEducationList = new EducationList();
          final Integer _tmpStatus_3;
          if (_cursor.isNull(_cursorIndexOfStatus_3)) {
            _tmpStatus_3 = null;
          } else {
            _tmpStatus_3 = _cursor.getInt(_cursorIndexOfStatus_3);
          }
          _tmpEducationList.setStatus(_tmpStatus_3);
          final List<EducationItem> _tmpData_3;
          final String _tmp_2;
          if (_cursor.isNull(_cursorIndexOfData_3)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _cursor.getString(_cursorIndexOfData_3);
          }
          _tmpData_3 = EducationItemTypeConverters.stringToEducationItemsList(_tmp_2);
          _tmpEducationList.setData(_tmpData_3);
        }  else  {
          _tmpEducationList = null;
        }
        final ProfessionalList _tmpProfessionalList;
        if (! (_cursor.isNull(_cursorIndexOfData_4) && _cursor.isNull(_cursorIndexOfStatus_4))) {
          _tmpProfessionalList = new ProfessionalList();
          final List<ProfessionItem> _tmpData_4;
          final String _tmp_3;
          if (_cursor.isNull(_cursorIndexOfData_4)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getString(_cursorIndexOfData_4);
          }
          _tmpData_4 = ProfessionalItemTypeConverters.stringToProfessionItemsList(_tmp_3);
          _tmpProfessionalList.setData(_tmpData_4);
          final Integer _tmpStatus_4;
          if (_cursor.isNull(_cursorIndexOfStatus_4)) {
            _tmpStatus_4 = null;
          } else {
            _tmpStatus_4 = _cursor.getInt(_cursorIndexOfStatus_4);
          }
          _tmpProfessionalList.setStatus(_tmpStatus_4);
        }  else  {
          _tmpProfessionalList = null;
        }
        final PersonalPreferences _tmpHobbies;
        if (! (_cursor.isNull(_cursorIndexOfData_5) && _cursor.isNull(_cursorIndexOfStatus_5))) {
          _tmpHobbies = new PersonalPreferences();
          final List<String> _tmpData_5;
          final String _tmp_4;
          if (_cursor.isNull(_cursorIndexOfData_5)) {
            _tmp_4 = null;
          } else {
            _tmp_4 = _cursor.getString(_cursorIndexOfData_5);
          }
          _tmpData_5 = StringTypeConverters.stringToStringList(_tmp_4);
          _tmpHobbies.setData(_tmpData_5);
          final Integer _tmpStatus_5;
          if (_cursor.isNull(_cursorIndexOfStatus_5)) {
            _tmpStatus_5 = null;
          } else {
            _tmpStatus_5 = _cursor.getInt(_cursorIndexOfStatus_5);
          }
          _tmpHobbies.setStatus(_tmpStatus_5);
        }  else  {
          _tmpHobbies = null;
        }
        final PersonalPreferences _tmpMovies;
        if (! (_cursor.isNull(_cursorIndexOfData_6) && _cursor.isNull(_cursorIndexOfStatus_6))) {
          _tmpMovies = new PersonalPreferences();
          final List<String> _tmpData_6;
          final String _tmp_5;
          if (_cursor.isNull(_cursorIndexOfData_6)) {
            _tmp_5 = null;
          } else {
            _tmp_5 = _cursor.getString(_cursorIndexOfData_6);
          }
          _tmpData_6 = StringTypeConverters.stringToStringList(_tmp_5);
          _tmpMovies.setData(_tmpData_6);
          final Integer _tmpStatus_6;
          if (_cursor.isNull(_cursorIndexOfStatus_6)) {
            _tmpStatus_6 = null;
          } else {
            _tmpStatus_6 = _cursor.getInt(_cursorIndexOfStatus_6);
          }
          _tmpMovies.setStatus(_tmpStatus_6);
        }  else  {
          _tmpMovies = null;
        }
        final PersonalPreferences _tmpSports;
        if (! (_cursor.isNull(_cursorIndexOfData_7) && _cursor.isNull(_cursorIndexOfStatus_7))) {
          _tmpSports = new PersonalPreferences();
          final List<String> _tmpData_7;
          final String _tmp_6;
          if (_cursor.isNull(_cursorIndexOfData_7)) {
            _tmp_6 = null;
          } else {
            _tmp_6 = _cursor.getString(_cursorIndexOfData_7);
          }
          _tmpData_7 = StringTypeConverters.stringToStringList(_tmp_6);
          _tmpSports.setData(_tmpData_7);
          final Integer _tmpStatus_7;
          if (_cursor.isNull(_cursorIndexOfStatus_7)) {
            _tmpStatus_7 = null;
          } else {
            _tmpStatus_7 = _cursor.getInt(_cursorIndexOfStatus_7);
          }
          _tmpSports.setStatus(_tmpStatus_7);
        }  else  {
          _tmpSports = null;
        }
        final PersonalPreferences _tmpFoodPreferences;
        if (! (_cursor.isNull(_cursorIndexOfData_8) && _cursor.isNull(_cursorIndexOfStatus_8))) {
          _tmpFoodPreferences = new PersonalPreferences();
          final List<String> _tmpData_8;
          final String _tmp_7;
          if (_cursor.isNull(_cursorIndexOfData_8)) {
            _tmp_7 = null;
          } else {
            _tmp_7 = _cursor.getString(_cursorIndexOfData_8);
          }
          _tmpData_8 = StringTypeConverters.stringToStringList(_tmp_7);
          _tmpFoodPreferences.setData(_tmpData_8);
          final Integer _tmpStatus_8;
          if (_cursor.isNull(_cursorIndexOfStatus_8)) {
            _tmpStatus_8 = null;
          } else {
            _tmpStatus_8 = _cursor.getInt(_cursorIndexOfStatus_8);
          }
          _tmpFoodPreferences.setStatus(_tmpStatus_8);
        }  else  {
          _tmpFoodPreferences = null;
        }
        final PersonalPreferences _tmpOtherPreferences;
        if (! (_cursor.isNull(_cursorIndexOfData_9) && _cursor.isNull(_cursorIndexOfStatus_9))) {
          _tmpOtherPreferences = new PersonalPreferences();
          final List<String> _tmpData_9;
          final String _tmp_8;
          if (_cursor.isNull(_cursorIndexOfData_9)) {
            _tmp_8 = null;
          } else {
            _tmp_8 = _cursor.getString(_cursorIndexOfData_9);
          }
          _tmpData_9 = StringTypeConverters.stringToStringList(_tmp_8);
          _tmpOtherPreferences.setData(_tmpData_9);
          final Integer _tmpStatus_9;
          if (_cursor.isNull(_cursorIndexOfStatus_9)) {
            _tmpStatus_9 = null;
          } else {
            _tmpStatus_9 = _cursor.getInt(_cursorIndexOfStatus_9);
          }
          _tmpOtherPreferences.setStatus(_tmpStatus_9);
        }  else  {
          _tmpOtherPreferences = null;
        }
        final EmergencyDetails _tmpEmergencyDetails;
        if (! (_cursor.isNull(_cursorIndexOfBloodGroup) && _cursor.isNull(_cursorIndexOfDoctorContact) && _cursor.isNull(_cursorIndexOfInsuranceAgent) && _cursor.isNull(_cursorIndexOfInsuranceContact) && _cursor.isNull(_cursorIndexOfEmergencyContact) && _cursor.isNull(_cursorIndexOfStatus_10))) {
          _tmpEmergencyDetails = new EmergencyDetails();
          final String _tmpBloodGroup;
          if (_cursor.isNull(_cursorIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _cursor.getString(_cursorIndexOfBloodGroup);
          }
          _tmpEmergencyDetails.setBloodGroup(_tmpBloodGroup);
          final String _tmpDoctorContact;
          if (_cursor.isNull(_cursorIndexOfDoctorContact)) {
            _tmpDoctorContact = null;
          } else {
            _tmpDoctorContact = _cursor.getString(_cursorIndexOfDoctorContact);
          }
          _tmpEmergencyDetails.setDoctorContact(_tmpDoctorContact);
          final String _tmpInsuranceAgent;
          if (_cursor.isNull(_cursorIndexOfInsuranceAgent)) {
            _tmpInsuranceAgent = null;
          } else {
            _tmpInsuranceAgent = _cursor.getString(_cursorIndexOfInsuranceAgent);
          }
          _tmpEmergencyDetails.setInsuranceAgent(_tmpInsuranceAgent);
          final String _tmpInsuranceContact;
          if (_cursor.isNull(_cursorIndexOfInsuranceContact)) {
            _tmpInsuranceContact = null;
          } else {
            _tmpInsuranceContact = _cursor.getString(_cursorIndexOfInsuranceContact);
          }
          _tmpEmergencyDetails.setInsuranceContact(_tmpInsuranceContact);
          final String _tmpEmergencyContact;
          if (_cursor.isNull(_cursorIndexOfEmergencyContact)) {
            _tmpEmergencyContact = null;
          } else {
            _tmpEmergencyContact = _cursor.getString(_cursorIndexOfEmergencyContact);
          }
          _tmpEmergencyDetails.setEmergencyContact(_tmpEmergencyContact);
          final Integer _tmpStatus_10;
          if (_cursor.isNull(_cursorIndexOfStatus_10)) {
            _tmpStatus_10 = null;
          } else {
            _tmpStatus_10 = _cursor.getInt(_cursorIndexOfStatus_10);
          }
          _tmpEmergencyDetails.setStatus(_tmpStatus_10);
        }  else  {
          _tmpEmergencyDetails = null;
        }
        final DataObject _tmpEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_10) && _cursor.isNull(_cursorIndexOfStatus_11))) {
          _tmpEmail = new DataObject();
          final String _tmpData_10;
          if (_cursor.isNull(_cursorIndexOfData_10)) {
            _tmpData_10 = null;
          } else {
            _tmpData_10 = _cursor.getString(_cursorIndexOfData_10);
          }
          _tmpEmail.setData(_tmpData_10);
          final Integer _tmpStatus_11;
          if (_cursor.isNull(_cursorIndexOfStatus_11)) {
            _tmpStatus_11 = null;
          } else {
            _tmpStatus_11 = _cursor.getInt(_cursorIndexOfStatus_11);
          }
          _tmpEmail.setStatus(_tmpStatus_11);
        }  else  {
          _tmpEmail = null;
        }
        final DataObject _tmpOfficeEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_11) && _cursor.isNull(_cursorIndexOfStatus_12))) {
          _tmpOfficeEmail = new DataObject();
          final String _tmpData_11;
          if (_cursor.isNull(_cursorIndexOfData_11)) {
            _tmpData_11 = null;
          } else {
            _tmpData_11 = _cursor.getString(_cursorIndexOfData_11);
          }
          _tmpOfficeEmail.setData(_tmpData_11);
          final Integer _tmpStatus_12;
          if (_cursor.isNull(_cursorIndexOfStatus_12)) {
            _tmpStatus_12 = null;
          } else {
            _tmpStatus_12 = _cursor.getInt(_cursorIndexOfStatus_12);
          }
          _tmpOfficeEmail.setStatus(_tmpStatus_12);
        }  else  {
          _tmpOfficeEmail = null;
        }
        final DataObject _tmpAlternateEmail;
        if (! (_cursor.isNull(_cursorIndexOfData_12) && _cursor.isNull(_cursorIndexOfStatus_13))) {
          _tmpAlternateEmail = new DataObject();
          final String _tmpData_12;
          if (_cursor.isNull(_cursorIndexOfData_12)) {
            _tmpData_12 = null;
          } else {
            _tmpData_12 = _cursor.getString(_cursorIndexOfData_12);
          }
          _tmpAlternateEmail.setData(_tmpData_12);
          final Integer _tmpStatus_13;
          if (_cursor.isNull(_cursorIndexOfStatus_13)) {
            _tmpStatus_13 = null;
          } else {
            _tmpStatus_13 = _cursor.getInt(_cursorIndexOfStatus_13);
          }
          _tmpAlternateEmail.setStatus(_tmpStatus_13);
        }  else  {
          _tmpAlternateEmail = null;
        }
        final DataObject _tmpOfficePhone;
        if (! (_cursor.isNull(_cursorIndexOfData_13) && _cursor.isNull(_cursorIndexOfStatus_14))) {
          _tmpOfficePhone = new DataObject();
          final String _tmpData_13;
          if (_cursor.isNull(_cursorIndexOfData_13)) {
            _tmpData_13 = null;
          } else {
            _tmpData_13 = _cursor.getString(_cursorIndexOfData_13);
          }
          _tmpOfficePhone.setData(_tmpData_13);
          final Integer _tmpStatus_14;
          if (_cursor.isNull(_cursorIndexOfStatus_14)) {
            _tmpStatus_14 = null;
          } else {
            _tmpStatus_14 = _cursor.getInt(_cursorIndexOfStatus_14);
          }
          _tmpOfficePhone.setStatus(_tmpStatus_14);
        }  else  {
          _tmpOfficePhone = null;
        }
        final DataObject _tmpAlternatePhone;
        if (! (_cursor.isNull(_cursorIndexOfData_14) && _cursor.isNull(_cursorIndexOfStatus_15))) {
          _tmpAlternatePhone = new DataObject();
          final String _tmpData_14;
          if (_cursor.isNull(_cursorIndexOfData_14)) {
            _tmpData_14 = null;
          } else {
            _tmpData_14 = _cursor.getString(_cursorIndexOfData_14);
          }
          _tmpAlternatePhone.setData(_tmpData_14);
          final Integer _tmpStatus_15;
          if (_cursor.isNull(_cursorIndexOfStatus_15)) {
            _tmpStatus_15 = null;
          } else {
            _tmpStatus_15 = _cursor.getInt(_cursorIndexOfStatus_15);
          }
          _tmpAlternatePhone.setStatus(_tmpStatus_15);
        }  else  {
          _tmpAlternatePhone = null;
        }
        final Location _tmpLocation;
        if (! (_cursor.isNull(_cursorIndexOfCoordinates))) {
          _tmpLocation = new Location();
          final List<Double> _tmpCoordinates;
          final String _tmp_9;
          if (_cursor.isNull(_cursorIndexOfCoordinates)) {
            _tmp_9 = null;
          } else {
            _tmp_9 = _cursor.getString(_cursorIndexOfCoordinates);
          }
          _tmpCoordinates = DoubleTypeConverters.stringToDoubleList(_tmp_9);
          _tmpLocation.setCoordinates(_tmpCoordinates);
        }  else  {
          _tmpLocation = null;
        }
        final Startup _tmpStartup;
        if (! (_cursor.isNull(_cursorIndexOfNearByRadius) && _cursor.isNull(_cursorIndexOfPurpose) && _cursor.isNull(_cursorIndexOfStatus_16) && _cursor.isNull(_cursorIndexOfWishlist))) {
          _tmpStartup = new Startup();
          final Integer _tmpNearByRadius;
          if (_cursor.isNull(_cursorIndexOfNearByRadius)) {
            _tmpNearByRadius = null;
          } else {
            _tmpNearByRadius = _cursor.getInt(_cursorIndexOfNearByRadius);
          }
          _tmpStartup.setNearByRadius(_tmpNearByRadius);
          final List<String> _tmpPurpose;
          final String _tmp_10;
          if (_cursor.isNull(_cursorIndexOfPurpose)) {
            _tmp_10 = null;
          } else {
            _tmp_10 = _cursor.getString(_cursorIndexOfPurpose);
          }
          _tmpPurpose = StringTypeConverters.stringToStringList(_tmp_10);
          _tmpStartup.setPurpose(_tmpPurpose);
          final int _tmpStatus_16;
          _tmpStatus_16 = _cursor.getInt(_cursorIndexOfStatus_16);
          _tmpStartup.setStatus(_tmpStatus_16);
          final String _tmpWishlist;
          if (_cursor.isNull(_cursorIndexOfWishlist)) {
            _tmpWishlist = null;
          } else {
            _tmpWishlist = _cursor.getString(_cursorIndexOfWishlist);
          }
          _tmpStartup.setWishlist(_tmpWishlist);
        }  else  {
          _tmpStartup = null;
        }
        final DataObject _tmpCompanyName;
        if (! (_cursor.isNull(_cursorIndexOfData_15) && _cursor.isNull(_cursorIndexOfStatus_17))) {
          _tmpCompanyName = new DataObject();
          final String _tmpData_15;
          if (_cursor.isNull(_cursorIndexOfData_15)) {
            _tmpData_15 = null;
          } else {
            _tmpData_15 = _cursor.getString(_cursorIndexOfData_15);
          }
          _tmpCompanyName.setData(_tmpData_15);
          final Integer _tmpStatus_17;
          if (_cursor.isNull(_cursorIndexOfStatus_17)) {
            _tmpStatus_17 = null;
          } else {
            _tmpStatus_17 = _cursor.getInt(_cursorIndexOfStatus_17);
          }
          _tmpCompanyName.setStatus(_tmpStatus_17);
        }  else  {
          _tmpCompanyName = null;
        }
        final DataObject _tmpProfession;
        if (! (_cursor.isNull(_cursorIndexOfData_16) && _cursor.isNull(_cursorIndexOfStatus_18))) {
          _tmpProfession = new DataObject();
          final String _tmpData_16;
          if (_cursor.isNull(_cursorIndexOfData_16)) {
            _tmpData_16 = null;
          } else {
            _tmpData_16 = _cursor.getString(_cursorIndexOfData_16);
          }
          _tmpProfession.setData(_tmpData_16);
          final Integer _tmpStatus_18;
          if (_cursor.isNull(_cursorIndexOfStatus_18)) {
            _tmpStatus_18 = null;
          } else {
            _tmpStatus_18 = _cursor.getInt(_cursorIndexOfStatus_18);
          }
          _tmpProfession.setStatus(_tmpStatus_18);
        }  else  {
          _tmpProfession = null;
        }
        final DataObject _tmpCategory;
        if (! (_cursor.isNull(_cursorIndexOfData_17) && _cursor.isNull(_cursorIndexOfStatus_19))) {
          _tmpCategory = new DataObject();
          final String _tmpData_17;
          if (_cursor.isNull(_cursorIndexOfData_17)) {
            _tmpData_17 = null;
          } else {
            _tmpData_17 = _cursor.getString(_cursorIndexOfData_17);
          }
          _tmpCategory.setData(_tmpData_17);
          final Integer _tmpStatus_19;
          if (_cursor.isNull(_cursorIndexOfStatus_19)) {
            _tmpStatus_19 = null;
          } else {
            _tmpStatus_19 = _cursor.getInt(_cursorIndexOfStatus_19);
          }
          _tmpCategory.setStatus(_tmpStatus_19);
        }  else  {
          _tmpCategory = null;
        }
        final DataObject _tmpYearsOfEstablish;
        if (! (_cursor.isNull(_cursorIndexOfData_18) && _cursor.isNull(_cursorIndexOfStatus_20))) {
          _tmpYearsOfEstablish = new DataObject();
          final String _tmpData_18;
          if (_cursor.isNull(_cursorIndexOfData_18)) {
            _tmpData_18 = null;
          } else {
            _tmpData_18 = _cursor.getString(_cursorIndexOfData_18);
          }
          _tmpYearsOfEstablish.setData(_tmpData_18);
          final Integer _tmpStatus_20;
          if (_cursor.isNull(_cursorIndexOfStatus_20)) {
            _tmpStatus_20 = null;
          } else {
            _tmpStatus_20 = _cursor.getInt(_cursorIndexOfStatus_20);
          }
          _tmpYearsOfEstablish.setStatus(_tmpStatus_20);
        }  else  {
          _tmpYearsOfEstablish = null;
        }
        final DataObject _tmpYearsOfExperience;
        if (! (_cursor.isNull(_cursorIndexOfData_19) && _cursor.isNull(_cursorIndexOfStatus_21))) {
          _tmpYearsOfExperience = new DataObject();
          final String _tmpData_19;
          if (_cursor.isNull(_cursorIndexOfData_19)) {
            _tmpData_19 = null;
          } else {
            _tmpData_19 = _cursor.getString(_cursorIndexOfData_19);
          }
          _tmpYearsOfExperience.setData(_tmpData_19);
          final Integer _tmpStatus_21;
          if (_cursor.isNull(_cursorIndexOfStatus_21)) {
            _tmpStatus_21 = null;
          } else {
            _tmpStatus_21 = _cursor.getInt(_cursorIndexOfStatus_21);
          }
          _tmpYearsOfExperience.setStatus(_tmpStatus_21);
        }  else  {
          _tmpYearsOfExperience = null;
        }
        final DataObject _tmpWebsite;
        if (! (_cursor.isNull(_cursorIndexOfData_20) && _cursor.isNull(_cursorIndexOfStatus_22))) {
          _tmpWebsite = new DataObject();
          final String _tmpData_20;
          if (_cursor.isNull(_cursorIndexOfData_20)) {
            _tmpData_20 = null;
          } else {
            _tmpData_20 = _cursor.getString(_cursorIndexOfData_20);
          }
          _tmpWebsite.setData(_tmpData_20);
          final Integer _tmpStatus_22;
          if (_cursor.isNull(_cursorIndexOfStatus_22)) {
            _tmpStatus_22 = null;
          } else {
            _tmpStatus_22 = _cursor.getInt(_cursorIndexOfStatus_22);
          }
          _tmpWebsite.setStatus(_tmpStatus_22);
        }  else  {
          _tmpWebsite = null;
        }
        final Visibility _tmpVisibility;
        if (! (_cursor.isNull(_cursorIndexOfDob_1) && _cursor.isNull(_cursorIndexOfProfilePic))) {
          _tmpVisibility = new Visibility();
          final Integer _tmpDob;
          if (_cursor.isNull(_cursorIndexOfDob_1)) {
            _tmpDob = null;
          } else {
            _tmpDob = _cursor.getInt(_cursorIndexOfDob_1);
          }
          _tmpVisibility.setDob(_tmpDob);
          final Integer _tmpProfilePic;
          if (_cursor.isNull(_cursorIndexOfProfilePic)) {
            _tmpProfilePic = null;
          } else {
            _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
          }
          _tmpVisibility.setProfilePic(_tmpProfilePic);
        }  else  {
          _tmpVisibility = null;
        }
        _item = new GetGeneralProfile();
        final String _tmpCountryCode;
        if (_cursor.isNull(_cursorIndexOfCountryCode)) {
          _tmpCountryCode = null;
        } else {
          _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
        }
        _item.setCountryCode(_tmpCountryCode);
        final Integer _tmpIsVerified;
        if (_cursor.isNull(_cursorIndexOfIsVerified)) {
          _tmpIsVerified = null;
        } else {
          _tmpIsVerified = _cursor.getInt(_cursorIndexOfIsVerified);
        }
        _item.setIsVerified(_tmpIsVerified);
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpNetclanId;
        if (_cursor.isNull(_cursorIndexOfNetclanId)) {
          _tmpNetclanId = null;
        } else {
          _tmpNetclanId = _cursor.getString(_cursorIndexOfNetclanId);
        }
        _item.setNetclanId(_tmpNetclanId);
        final long _tmpPhone;
        _tmpPhone = _cursor.getLong(_cursorIndexOfPhone);
        _item.setPhone(_tmpPhone);
        final Integer _tmpPhoneStatus;
        if (_cursor.isNull(_cursorIndexOfPhoneStatus)) {
          _tmpPhoneStatus = null;
        } else {
          _tmpPhoneStatus = _cursor.getInt(_cursorIndexOfPhoneStatus);
        }
        _item.setPhoneStatus(_tmpPhoneStatus);
        final Integer _tmpLoginVia;
        if (_cursor.isNull(_cursorIndexOfLoginVia)) {
          _tmpLoginVia = null;
        } else {
          _tmpLoginVia = _cursor.getInt(_cursorIndexOfLoginVia);
        }
        _item.setLoginVia(_tmpLoginVia);
        final Integer _tmpV;
        if (_cursor.isNull(_cursorIndexOfV)) {
          _tmpV = null;
        } else {
          _tmpV = _cursor.getInt(_cursorIndexOfV);
        }
        _item.setV(_tmpV);
        final String _tmpFullName;
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _tmpFullName = null;
        } else {
          _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
        }
        _item.setFullName(_tmpFullName);
        final String _tmpFirstName;
        if (_cursor.isNull(_cursorIndexOfFirstName)) {
          _tmpFirstName = null;
        } else {
          _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        }
        _item.setFirstName(_tmpFirstName);
        final String _tmpLastName;
        if (_cursor.isNull(_cursorIndexOfLastName)) {
          _tmpLastName = null;
        } else {
          _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
        }
        _item.setLastName(_tmpLastName);
        final int _tmpGender;
        _tmpGender = _cursor.getInt(_cursorIndexOfGender);
        _item.setGender(_tmpGender);
        final String _tmpMerchantName;
        if (_cursor.isNull(_cursorIndexOfMerchantName)) {
          _tmpMerchantName = null;
        } else {
          _tmpMerchantName = _cursor.getString(_cursorIndexOfMerchantName);
        }
        _item.setMerchantName(_tmpMerchantName);
        final Integer _tmpUserType;
        if (_cursor.isNull(_cursorIndexOfUserType)) {
          _tmpUserType = null;
        } else {
          _tmpUserType = _cursor.getInt(_cursorIndexOfUserType);
        }
        _item.setUserType(_tmpUserType);
        final String _tmpPincode;
        if (_cursor.isNull(_cursorIndexOfPincode)) {
          _tmpPincode = null;
        } else {
          _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
        }
        _item.setPincode(_tmpPincode);
        final String _tmpProfilePicUrl;
        if (_cursor.isNull(_cursorIndexOfProfilePicUrl)) {
          _tmpProfilePicUrl = null;
        } else {
          _tmpProfilePicUrl = _cursor.getString(_cursorIndexOfProfilePicUrl);
        }
        _item.setProfilePicUrl(_tmpProfilePicUrl);
        final int _tmpProfileScore;
        _tmpProfileScore = _cursor.getInt(_cursorIndexOfProfileScore);
        _item.setProfileScore(_tmpProfileScore);
        final Boolean _tmpIsNewUser;
        final Integer _tmp_11;
        if (_cursor.isNull(_cursorIndexOfIsNewUser)) {
          _tmp_11 = null;
        } else {
          _tmp_11 = _cursor.getInt(_cursorIndexOfIsNewUser);
        }
        _tmpIsNewUser = _tmp_11 == null ? null : _tmp_11 != 0;
        _item.setNewUser(_tmpIsNewUser);
        final String _tmpDob_1;
        if (_cursor.isNull(_cursorIndexOfDob)) {
          _tmpDob_1 = null;
        } else {
          _tmpDob_1 = _cursor.getString(_cursorIndexOfDob);
        }
        _item.setDob(_tmpDob_1);
        final int _tmpInvStatus;
        _tmpInvStatus = _cursor.getInt(_cursorIndexOfInvStatus);
        _item.setInvStatus(_tmpInvStatus);
        final String _tmpServiceType;
        if (_cursor.isNull(_cursorIndexOfServiceType)) {
          _tmpServiceType = null;
        } else {
          _tmpServiceType = _cursor.getString(_cursorIndexOfServiceType);
        }
        _item.setServiceType(_tmpServiceType);
        final String _tmpServiceName;
        if (_cursor.isNull(_cursorIndexOfServiceName)) {
          _tmpServiceName = null;
        } else {
          _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
        }
        _item.setServiceName(_tmpServiceName);
        final String _tmpLastSyncDate;
        if (_cursor.isNull(_cursorIndexOfLastSyncDate)) {
          _tmpLastSyncDate = null;
        } else {
          _tmpLastSyncDate = _cursor.getString(_cursorIndexOfLastSyncDate);
        }
        _item.setLastSyncDate(_tmpLastSyncDate);
        final String _tmpModifiedDate;
        if (_cursor.isNull(_cursorIndexOfModifiedDate)) {
          _tmpModifiedDate = null;
        } else {
          _tmpModifiedDate = _cursor.getString(_cursorIndexOfModifiedDate);
        }
        _item.setModifiedDate(_tmpModifiedDate);
        final String _tmpFullPhone;
        if (_cursor.isNull(_cursorIndexOfFullPhone)) {
          _tmpFullPhone = null;
        } else {
          _tmpFullPhone = _cursor.getString(_cursorIndexOfFullPhone);
        }
        _item.setFullPhone(_tmpFullPhone);
        _item.setBio(_tmpBio);
        _item.setPlaceList(_tmpPlaceList);
        _item.setSocialList(_tmpSocialList);
        _item.setEducationList(_tmpEducationList);
        _item.setProfessionalList(_tmpProfessionalList);
        _item.setHobbies(_tmpHobbies);
        _item.setMovies(_tmpMovies);
        _item.setSports(_tmpSports);
        _item.setFoodPreferences(_tmpFoodPreferences);
        _item.setOtherPreferences(_tmpOtherPreferences);
        _item.setEmergencyDetails(_tmpEmergencyDetails);
        _item.setEmail(_tmpEmail);
        _item.setOfficeEmail(_tmpOfficeEmail);
        _item.setAlternateEmail(_tmpAlternateEmail);
        _item.setOfficePhone(_tmpOfficePhone);
        _item.setAlternatePhone(_tmpAlternatePhone);
        _item.setLocation(_tmpLocation);
        _item.setStartup(_tmpStartup);
        _item.setCompanyName(_tmpCompanyName);
        _item.setProfession(_tmpProfession);
        _item.setCategory(_tmpCategory);
        _item.setYearsOfEstablish(_tmpYearsOfEstablish);
        _item.setYearsOfExperience(_tmpYearsOfExperience);
        _item.setWebsite(_tmpWebsite);
        _item.setVisibility(_tmpVisibility);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
