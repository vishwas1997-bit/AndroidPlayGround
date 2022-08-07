package com.example.kotlindemo.netclan;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.kotlindemo.netclan.RoomForConnectionList.ConnectionsDao;
import com.example.kotlindemo.netclan.RoomForConnectionList.ConnectionsDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.HomeTownDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.HomeTownDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.LivesInDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.LivesInDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.MoviesDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.MoviesDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.OriginDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.OriginDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PhoneContactDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PhoneContactDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PurposeDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PurposeDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.SportsDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.SportsDao_Impl;
import com.example.kotlindemo.netclan.RoomForContactsProfile.UniversityDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.UniversityDao_Impl;
import com.example.kotlindemo.netclan.local.NoteListDao;
import com.example.kotlindemo.netclan.local.NoteListDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NetworkingDataBase_Impl extends NetworkingDataBase {
  private volatile ConnectionsDao _connectionsDao;

  private volatile MoviesDao _moviesDao;

  private volatile SportsDao _sportsDao;

  private volatile PurposeDao _purposeDao;

  private volatile UniversityDao _universityDao;

  private volatile OriginDao _originDao;

  private volatile PhoneContactDao _phoneContactDao;

  private volatile NoteListDao _noteListDao;

  private volatile LivesInDao _livesInDao;

  private volatile HomeTownDao _homeTownDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `profile` (`countryCode` TEXT, `isVerified` INTEGER, `_id` TEXT NOT NULL, `netClanId` TEXT, `phone` INTEGER NOT NULL, `phoneStatus` INTEGER, `loginVia` INTEGER, `v_` INTEGER, `fullName` TEXT, `firstName` TEXT, `lastName` TEXT, `gender` INTEGER NOT NULL, `merchantName` TEXT, `userType_` INTEGER, `pincode` TEXT, `profilePicUrl` TEXT, `profileScore` INTEGER NOT NULL, `isNewUser` INTEGER, `dob` TEXT, `invStatus` INTEGER NOT NULL, `serviceType` TEXT, `serviceName` TEXT, `lastSyncDate` TEXT, `modifiedDate` TEXT, `fullPhone` TEXT, `bio_data` TEXT, `bio_status` INTEGER, `places_data` TEXT, `places_status` INTEGER, `socialMedia_data` TEXT, `socialMedia_status` INTEGER, `education_status` INTEGER, `education_data` TEXT, `professional_data` TEXT, `professional_status` INTEGER, `hobbies_data` TEXT, `hobbies_status` INTEGER, `movies_data` TEXT, `movies_status` INTEGER, `sports_data` TEXT, `sports_status` INTEGER, `foodPreferences_data` TEXT, `foodPreferences_status` INTEGER, `otherPreferences_data` TEXT, `otherPreferences_status` INTEGER, `emergencyDetails_bloodGroup` TEXT, `emergencyDetails_doctorContact` TEXT, `emergencyDetails_insuranceAgent` TEXT, `emergencyDetails_insuranceContact` TEXT, `emergencyDetails_emergencyContact` TEXT, `emergencyDetails_status` INTEGER, `email_data` TEXT, `email_status` INTEGER, `officeEmail_data` TEXT, `officeEmail_status` INTEGER, `alternateEmail_data` TEXT, `alternateEmail_status` INTEGER, `officePhone_data` TEXT, `officePhone_status` INTEGER, `alternatePhone_data` TEXT, `alternatePhone_status` INTEGER, `location_coordinates` TEXT, `startup_nearByRadius` INTEGER, `startup_purpose` TEXT, `startup_status` INTEGER, `startup_wishlist` TEXT, `companyName_data` TEXT, `companyName_status` INTEGER, `profession_data` TEXT, `profession_status` INTEGER, `category_data` TEXT, `category_status` INTEGER, `yearsOfEstablish_data` TEXT, `yearsOfEstablish_status` INTEGER, `yearsOfExperience_data` TEXT, `yearsOfExperience_status` INTEGER, `website_data` TEXT, `website_status` INTEGER, `visibility_dob_status` INTEGER, `visibility_profilePic_status` INTEGER, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `profile_table` (`_id` TEXT NOT NULL, `inProfileDataBase` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `contacts_table` (`_id` TEXT NOT NULL, `inContactsDataBase` INTEGER NOT NULL, `fullPhone` TEXT, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `connection_table` (`_id` TEXT NOT NULL, `inConnectionDataBase` INTEGER NOT NULL, `fullPhone` TEXT, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movies_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInMoviesTable` TEXT, `movieType` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `hobbies_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInHobbiesTable` TEXT, `hobbiesType` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInFoodTable` TEXT, `foodType` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sports_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInSportsTable` TEXT, `sportsType` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `purpose_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInPurposeTable` TEXT, `purposeType` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `company_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInCompanyTable` TEXT, `companyName` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `university_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInUniversityTable` TEXT, `universityName` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `origin_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInOriginTable` TEXT, `_cityName` TEXT, `_stateName` TEXT, `_status` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `find_contact_response` (`fullPhone` TEXT NOT NULL, `_id` TEXT, `phone` INTEGER, `firstName` TEXT, `lastName` TEXT, `profilePicUrl` TEXT, `userType` INTEGER, `invStatus` INTEGER NOT NULL, PRIMARY KEY(`fullPhone`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `buy_sell_chat_table` (`_id` TEXT NOT NULL, `inChatDataBase` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `notes_table` (`local_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT, `description` TEXT, `date` TEXT, `createNoteFlag` INTEGER NOT NULL, `updateNoteFlag` INTEGER NOT NULL, `deleteNoteFlag` INTEGER NOT NULL, `server_id` TEXT, `title` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `livesIn_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInLivesInTable` TEXT, `livesIn` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HomesTown_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userIdInHomeTownTable` TEXT, `home_Town` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `phone_contact_table` (`fullPhone` TEXT NOT NULL, `name` TEXT, `photoUri` TEXT, PRIMARY KEY(`fullPhone`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '19599bb92b1beada5492521f3695684e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `profile`");
        _db.execSQL("DROP TABLE IF EXISTS `profile_table`");
        _db.execSQL("DROP TABLE IF EXISTS `contacts_table`");
        _db.execSQL("DROP TABLE IF EXISTS `connection_table`");
        _db.execSQL("DROP TABLE IF EXISTS `movies_table`");
        _db.execSQL("DROP TABLE IF EXISTS `hobbies_table`");
        _db.execSQL("DROP TABLE IF EXISTS `food_table`");
        _db.execSQL("DROP TABLE IF EXISTS `sports_table`");
        _db.execSQL("DROP TABLE IF EXISTS `purpose_table`");
        _db.execSQL("DROP TABLE IF EXISTS `company_table`");
        _db.execSQL("DROP TABLE IF EXISTS `university_table`");
        _db.execSQL("DROP TABLE IF EXISTS `origin_table`");
        _db.execSQL("DROP TABLE IF EXISTS `find_contact_response`");
        _db.execSQL("DROP TABLE IF EXISTS `buy_sell_chat_table`");
        _db.execSQL("DROP TABLE IF EXISTS `notes_table`");
        _db.execSQL("DROP TABLE IF EXISTS `livesIn_table`");
        _db.execSQL("DROP TABLE IF EXISTS `HomesTown_table`");
        _db.execSQL("DROP TABLE IF EXISTS `phone_contact_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsProfile = new HashMap<String, TableInfo.Column>(80);
        _columnsProfile.put("countryCode", new TableInfo.Column("countryCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("isVerified", new TableInfo.Column("isVerified", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("netClanId", new TableInfo.Column("netClanId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("phone", new TableInfo.Column("phone", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("phoneStatus", new TableInfo.Column("phoneStatus", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("loginVia", new TableInfo.Column("loginVia", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("v_", new TableInfo.Column("v_", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("fullName", new TableInfo.Column("fullName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("firstName", new TableInfo.Column("firstName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("lastName", new TableInfo.Column("lastName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("gender", new TableInfo.Column("gender", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("merchantName", new TableInfo.Column("merchantName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("userType_", new TableInfo.Column("userType_", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("pincode", new TableInfo.Column("pincode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("profilePicUrl", new TableInfo.Column("profilePicUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("profileScore", new TableInfo.Column("profileScore", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("isNewUser", new TableInfo.Column("isNewUser", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("dob", new TableInfo.Column("dob", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("invStatus", new TableInfo.Column("invStatus", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("serviceType", new TableInfo.Column("serviceType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("serviceName", new TableInfo.Column("serviceName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("lastSyncDate", new TableInfo.Column("lastSyncDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("modifiedDate", new TableInfo.Column("modifiedDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("fullPhone", new TableInfo.Column("fullPhone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("bio_data", new TableInfo.Column("bio_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("bio_status", new TableInfo.Column("bio_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("places_data", new TableInfo.Column("places_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("places_status", new TableInfo.Column("places_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("socialMedia_data", new TableInfo.Column("socialMedia_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("socialMedia_status", new TableInfo.Column("socialMedia_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("education_status", new TableInfo.Column("education_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("education_data", new TableInfo.Column("education_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("professional_data", new TableInfo.Column("professional_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("professional_status", new TableInfo.Column("professional_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("hobbies_data", new TableInfo.Column("hobbies_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("hobbies_status", new TableInfo.Column("hobbies_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("movies_data", new TableInfo.Column("movies_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("movies_status", new TableInfo.Column("movies_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("sports_data", new TableInfo.Column("sports_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("sports_status", new TableInfo.Column("sports_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("foodPreferences_data", new TableInfo.Column("foodPreferences_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("foodPreferences_status", new TableInfo.Column("foodPreferences_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("otherPreferences_data", new TableInfo.Column("otherPreferences_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("otherPreferences_status", new TableInfo.Column("otherPreferences_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("emergencyDetails_bloodGroup", new TableInfo.Column("emergencyDetails_bloodGroup", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("emergencyDetails_doctorContact", new TableInfo.Column("emergencyDetails_doctorContact", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("emergencyDetails_insuranceAgent", new TableInfo.Column("emergencyDetails_insuranceAgent", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("emergencyDetails_insuranceContact", new TableInfo.Column("emergencyDetails_insuranceContact", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("emergencyDetails_emergencyContact", new TableInfo.Column("emergencyDetails_emergencyContact", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("emergencyDetails_status", new TableInfo.Column("emergencyDetails_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("email_data", new TableInfo.Column("email_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("email_status", new TableInfo.Column("email_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("officeEmail_data", new TableInfo.Column("officeEmail_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("officeEmail_status", new TableInfo.Column("officeEmail_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("alternateEmail_data", new TableInfo.Column("alternateEmail_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("alternateEmail_status", new TableInfo.Column("alternateEmail_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("officePhone_data", new TableInfo.Column("officePhone_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("officePhone_status", new TableInfo.Column("officePhone_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("alternatePhone_data", new TableInfo.Column("alternatePhone_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("alternatePhone_status", new TableInfo.Column("alternatePhone_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("location_coordinates", new TableInfo.Column("location_coordinates", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("startup_nearByRadius", new TableInfo.Column("startup_nearByRadius", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("startup_purpose", new TableInfo.Column("startup_purpose", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("startup_status", new TableInfo.Column("startup_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("startup_wishlist", new TableInfo.Column("startup_wishlist", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("companyName_data", new TableInfo.Column("companyName_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("companyName_status", new TableInfo.Column("companyName_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("profession_data", new TableInfo.Column("profession_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("profession_status", new TableInfo.Column("profession_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("category_data", new TableInfo.Column("category_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("category_status", new TableInfo.Column("category_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("yearsOfEstablish_data", new TableInfo.Column("yearsOfEstablish_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("yearsOfEstablish_status", new TableInfo.Column("yearsOfEstablish_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("yearsOfExperience_data", new TableInfo.Column("yearsOfExperience_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("yearsOfExperience_status", new TableInfo.Column("yearsOfExperience_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("website_data", new TableInfo.Column("website_data", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("website_status", new TableInfo.Column("website_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("visibility_dob_status", new TableInfo.Column("visibility_dob_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("visibility_profilePic_status", new TableInfo.Column("visibility_profilePic_status", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProfile = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProfile = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProfile = new TableInfo("profile", _columnsProfile, _foreignKeysProfile, _indicesProfile);
        final TableInfo _existingProfile = TableInfo.read(_db, "profile");
        if (! _infoProfile.equals(_existingProfile)) {
          return new RoomOpenHelper.ValidationResult(false, "profile(com.example.kotlindemo.netclan.response_model.GetGeneralProfile).\n"
                  + " Expected:\n" + _infoProfile + "\n"
                  + " Found:\n" + _existingProfile);
        }
        final HashMap<String, TableInfo.Column> _columnsProfileTable = new HashMap<String, TableInfo.Column>(2);
        _columnsProfileTable.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfileTable.put("inProfileDataBase", new TableInfo.Column("inProfileDataBase", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProfileTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProfileTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProfileTable = new TableInfo("profile_table", _columnsProfileTable, _foreignKeysProfileTable, _indicesProfileTable);
        final TableInfo _existingProfileTable = TableInfo.read(_db, "profile_table");
        if (! _infoProfileTable.equals(_existingProfileTable)) {
          return new RoomOpenHelper.ValidationResult(false, "profile_table(com.example.kotlindemo.netclan.ProfileEntity).\n"
                  + " Expected:\n" + _infoProfileTable + "\n"
                  + " Found:\n" + _existingProfileTable);
        }
        final HashMap<String, TableInfo.Column> _columnsContactsTable = new HashMap<String, TableInfo.Column>(3);
        _columnsContactsTable.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactsTable.put("inContactsDataBase", new TableInfo.Column("inContactsDataBase", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactsTable.put("fullPhone", new TableInfo.Column("fullPhone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysContactsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesContactsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoContactsTable = new TableInfo("contacts_table", _columnsContactsTable, _foreignKeysContactsTable, _indicesContactsTable);
        final TableInfo _existingContactsTable = TableInfo.read(_db, "contacts_table");
        if (! _infoContactsTable.equals(_existingContactsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "contacts_table(com.example.kotlindemo.netclan.RoomForContactsProfile.ContactEntity).\n"
                  + " Expected:\n" + _infoContactsTable + "\n"
                  + " Found:\n" + _existingContactsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsConnectionTable = new HashMap<String, TableInfo.Column>(3);
        _columnsConnectionTable.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsConnectionTable.put("inConnectionDataBase", new TableInfo.Column("inConnectionDataBase", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsConnectionTable.put("fullPhone", new TableInfo.Column("fullPhone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysConnectionTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesConnectionTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoConnectionTable = new TableInfo("connection_table", _columnsConnectionTable, _foreignKeysConnectionTable, _indicesConnectionTable);
        final TableInfo _existingConnectionTable = TableInfo.read(_db, "connection_table");
        if (! _infoConnectionTable.equals(_existingConnectionTable)) {
          return new RoomOpenHelper.ValidationResult(false, "connection_table(com.example.kotlindemo.netclan.RoomForConnectionList.ConnectionEntity).\n"
                  + " Expected:\n" + _infoConnectionTable + "\n"
                  + " Found:\n" + _existingConnectionTable);
        }
        final HashMap<String, TableInfo.Column> _columnsMoviesTable = new HashMap<String, TableInfo.Column>(3);
        _columnsMoviesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("userIdInMoviesTable", new TableInfo.Column("userIdInMoviesTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieType", new TableInfo.Column("movieType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMoviesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMoviesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMoviesTable = new TableInfo("movies_table", _columnsMoviesTable, _foreignKeysMoviesTable, _indicesMoviesTable);
        final TableInfo _existingMoviesTable = TableInfo.read(_db, "movies_table");
        if (! _infoMoviesTable.equals(_existingMoviesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "movies_table(com.example.kotlindemo.netclan.RoomForContactsProfile.MoviesEntity).\n"
                  + " Expected:\n" + _infoMoviesTable + "\n"
                  + " Found:\n" + _existingMoviesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsHobbiesTable = new HashMap<String, TableInfo.Column>(3);
        _columnsHobbiesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHobbiesTable.put("userIdInHobbiesTable", new TableInfo.Column("userIdInHobbiesTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHobbiesTable.put("hobbiesType", new TableInfo.Column("hobbiesType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHobbiesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHobbiesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHobbiesTable = new TableInfo("hobbies_table", _columnsHobbiesTable, _foreignKeysHobbiesTable, _indicesHobbiesTable);
        final TableInfo _existingHobbiesTable = TableInfo.read(_db, "hobbies_table");
        if (! _infoHobbiesTable.equals(_existingHobbiesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "hobbies_table(com.example.kotlindemo.netclan.RoomForContactsProfile.HobbiesEntity).\n"
                  + " Expected:\n" + _infoHobbiesTable + "\n"
                  + " Found:\n" + _existingHobbiesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFoodTable = new HashMap<String, TableInfo.Column>(3);
        _columnsFoodTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFoodTable.put("userIdInFoodTable", new TableInfo.Column("userIdInFoodTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFoodTable.put("foodType", new TableInfo.Column("foodType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFoodTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFoodTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFoodTable = new TableInfo("food_table", _columnsFoodTable, _foreignKeysFoodTable, _indicesFoodTable);
        final TableInfo _existingFoodTable = TableInfo.read(_db, "food_table");
        if (! _infoFoodTable.equals(_existingFoodTable)) {
          return new RoomOpenHelper.ValidationResult(false, "food_table(com.example.kotlindemo.netclan.RoomForContactsProfile.FoodEntity).\n"
                  + " Expected:\n" + _infoFoodTable + "\n"
                  + " Found:\n" + _existingFoodTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSportsTable = new HashMap<String, TableInfo.Column>(3);
        _columnsSportsTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSportsTable.put("userIdInSportsTable", new TableInfo.Column("userIdInSportsTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSportsTable.put("sportsType", new TableInfo.Column("sportsType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSportsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSportsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSportsTable = new TableInfo("sports_table", _columnsSportsTable, _foreignKeysSportsTable, _indicesSportsTable);
        final TableInfo _existingSportsTable = TableInfo.read(_db, "sports_table");
        if (! _infoSportsTable.equals(_existingSportsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "sports_table(com.example.kotlindemo.netclan.RoomForContactsProfile.SportsEntity).\n"
                  + " Expected:\n" + _infoSportsTable + "\n"
                  + " Found:\n" + _existingSportsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsPurposeTable = new HashMap<String, TableInfo.Column>(3);
        _columnsPurposeTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPurposeTable.put("userIdInPurposeTable", new TableInfo.Column("userIdInPurposeTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPurposeTable.put("purposeType", new TableInfo.Column("purposeType", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPurposeTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPurposeTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPurposeTable = new TableInfo("purpose_table", _columnsPurposeTable, _foreignKeysPurposeTable, _indicesPurposeTable);
        final TableInfo _existingPurposeTable = TableInfo.read(_db, "purpose_table");
        if (! _infoPurposeTable.equals(_existingPurposeTable)) {
          return new RoomOpenHelper.ValidationResult(false, "purpose_table(com.example.kotlindemo.netclan.RoomForContactsProfile.PurposeEntity).\n"
                  + " Expected:\n" + _infoPurposeTable + "\n"
                  + " Found:\n" + _existingPurposeTable);
        }
        final HashMap<String, TableInfo.Column> _columnsCompanyTable = new HashMap<String, TableInfo.Column>(3);
        _columnsCompanyTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyTable.put("userIdInCompanyTable", new TableInfo.Column("userIdInCompanyTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCompanyTable.put("companyName", new TableInfo.Column("companyName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCompanyTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCompanyTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCompanyTable = new TableInfo("company_table", _columnsCompanyTable, _foreignKeysCompanyTable, _indicesCompanyTable);
        final TableInfo _existingCompanyTable = TableInfo.read(_db, "company_table");
        if (! _infoCompanyTable.equals(_existingCompanyTable)) {
          return new RoomOpenHelper.ValidationResult(false, "company_table(com.example.kotlindemo.netclan.RoomForContactsProfile.CompanyEntity).\n"
                  + " Expected:\n" + _infoCompanyTable + "\n"
                  + " Found:\n" + _existingCompanyTable);
        }
        final HashMap<String, TableInfo.Column> _columnsUniversityTable = new HashMap<String, TableInfo.Column>(3);
        _columnsUniversityTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUniversityTable.put("userIdInUniversityTable", new TableInfo.Column("userIdInUniversityTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUniversityTable.put("universityName", new TableInfo.Column("universityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUniversityTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUniversityTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUniversityTable = new TableInfo("university_table", _columnsUniversityTable, _foreignKeysUniversityTable, _indicesUniversityTable);
        final TableInfo _existingUniversityTable = TableInfo.read(_db, "university_table");
        if (! _infoUniversityTable.equals(_existingUniversityTable)) {
          return new RoomOpenHelper.ValidationResult(false, "university_table(com.example.kotlindemo.netclan.RoomForContactsProfile.UniversityEntity).\n"
                  + " Expected:\n" + _infoUniversityTable + "\n"
                  + " Found:\n" + _existingUniversityTable);
        }
        final HashMap<String, TableInfo.Column> _columnsOriginTable = new HashMap<String, TableInfo.Column>(5);
        _columnsOriginTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOriginTable.put("userIdInOriginTable", new TableInfo.Column("userIdInOriginTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOriginTable.put("_cityName", new TableInfo.Column("_cityName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOriginTable.put("_stateName", new TableInfo.Column("_stateName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOriginTable.put("_status", new TableInfo.Column("_status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOriginTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOriginTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOriginTable = new TableInfo("origin_table", _columnsOriginTable, _foreignKeysOriginTable, _indicesOriginTable);
        final TableInfo _existingOriginTable = TableInfo.read(_db, "origin_table");
        if (! _infoOriginTable.equals(_existingOriginTable)) {
          return new RoomOpenHelper.ValidationResult(false, "origin_table(com.example.kotlindemo.netclan.RoomForContactsProfile.OriginEntity).\n"
                  + " Expected:\n" + _infoOriginTable + "\n"
                  + " Found:\n" + _existingOriginTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFindContactResponse = new HashMap<String, TableInfo.Column>(8);
        _columnsFindContactResponse.put("fullPhone", new TableInfo.Column("fullPhone", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("_id", new TableInfo.Column("_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("phone", new TableInfo.Column("phone", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("firstName", new TableInfo.Column("firstName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("lastName", new TableInfo.Column("lastName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("profilePicUrl", new TableInfo.Column("profilePicUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("userType", new TableInfo.Column("userType", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFindContactResponse.put("invStatus", new TableInfo.Column("invStatus", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFindContactResponse = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFindContactResponse = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFindContactResponse = new TableInfo("find_contact_response", _columnsFindContactResponse, _foreignKeysFindContactResponse, _indicesFindContactResponse);
        final TableInfo _existingFindContactResponse = TableInfo.read(_db, "find_contact_response");
        if (! _infoFindContactResponse.equals(_existingFindContactResponse)) {
          return new RoomOpenHelper.ValidationResult(false, "find_contact_response(com.example.kotlindemo.netclan.RoomForContactsProfile.FindContactResponse).\n"
                  + " Expected:\n" + _infoFindContactResponse + "\n"
                  + " Found:\n" + _existingFindContactResponse);
        }
        final HashMap<String, TableInfo.Column> _columnsBuySellChatTable = new HashMap<String, TableInfo.Column>(2);
        _columnsBuySellChatTable.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBuySellChatTable.put("inChatDataBase", new TableInfo.Column("inChatDataBase", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBuySellChatTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBuySellChatTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBuySellChatTable = new TableInfo("buy_sell_chat_table", _columnsBuySellChatTable, _foreignKeysBuySellChatTable, _indicesBuySellChatTable);
        final TableInfo _existingBuySellChatTable = TableInfo.read(_db, "buy_sell_chat_table");
        if (! _infoBuySellChatTable.equals(_existingBuySellChatTable)) {
          return new RoomOpenHelper.ValidationResult(false, "buy_sell_chat_table(com.example.kotlindemo.netclan.BuySellChatEntity).\n"
                  + " Expected:\n" + _infoBuySellChatTable + "\n"
                  + " Found:\n" + _existingBuySellChatTable);
        }
        final HashMap<String, TableInfo.Column> _columnsNotesTable = new HashMap<String, TableInfo.Column>(9);
        _columnsNotesTable.put("local_id", new TableInfo.Column("local_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("createNoteFlag", new TableInfo.Column("createNoteFlag", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("updateNoteFlag", new TableInfo.Column("updateNoteFlag", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("deleteNoteFlag", new TableInfo.Column("deleteNoteFlag", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("server_id", new TableInfo.Column("server_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotesTable.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNotesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNotesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNotesTable = new TableInfo("notes_table", _columnsNotesTable, _foreignKeysNotesTable, _indicesNotesTable);
        final TableInfo _existingNotesTable = TableInfo.read(_db, "notes_table");
        if (! _infoNotesTable.equals(_existingNotesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "notes_table(com.example.kotlindemo.netclan.local.NotesEntity).\n"
                  + " Expected:\n" + _infoNotesTable + "\n"
                  + " Found:\n" + _existingNotesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsLivesInTable = new HashMap<String, TableInfo.Column>(3);
        _columnsLivesInTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLivesInTable.put("userIdInLivesInTable", new TableInfo.Column("userIdInLivesInTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLivesInTable.put("livesIn", new TableInfo.Column("livesIn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLivesInTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLivesInTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLivesInTable = new TableInfo("livesIn_table", _columnsLivesInTable, _foreignKeysLivesInTable, _indicesLivesInTable);
        final TableInfo _existingLivesInTable = TableInfo.read(_db, "livesIn_table");
        if (! _infoLivesInTable.equals(_existingLivesInTable)) {
          return new RoomOpenHelper.ValidationResult(false, "livesIn_table(com.example.kotlindemo.netclan.RoomForContactsProfile.LivesInEntity).\n"
                  + " Expected:\n" + _infoLivesInTable + "\n"
                  + " Found:\n" + _existingLivesInTable);
        }
        final HashMap<String, TableInfo.Column> _columnsHomesTownTable = new HashMap<String, TableInfo.Column>(3);
        _columnsHomesTownTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomesTownTable.put("userIdInHomeTownTable", new TableInfo.Column("userIdInHomeTownTable", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHomesTownTable.put("home_Town", new TableInfo.Column("home_Town", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHomesTownTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHomesTownTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHomesTownTable = new TableInfo("HomesTown_table", _columnsHomesTownTable, _foreignKeysHomesTownTable, _indicesHomesTownTable);
        final TableInfo _existingHomesTownTable = TableInfo.read(_db, "HomesTown_table");
        if (! _infoHomesTownTable.equals(_existingHomesTownTable)) {
          return new RoomOpenHelper.ValidationResult(false, "HomesTown_table(com.example.kotlindemo.netclan.RoomForContactsProfile.HomeTownEntity).\n"
                  + " Expected:\n" + _infoHomesTownTable + "\n"
                  + " Found:\n" + _existingHomesTownTable);
        }
        final HashMap<String, TableInfo.Column> _columnsPhoneContactTable = new HashMap<String, TableInfo.Column>(3);
        _columnsPhoneContactTable.put("fullPhone", new TableInfo.Column("fullPhone", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoneContactTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhoneContactTable.put("photoUri", new TableInfo.Column("photoUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPhoneContactTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPhoneContactTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPhoneContactTable = new TableInfo("phone_contact_table", _columnsPhoneContactTable, _foreignKeysPhoneContactTable, _indicesPhoneContactTable);
        final TableInfo _existingPhoneContactTable = TableInfo.read(_db, "phone_contact_table");
        if (! _infoPhoneContactTable.equals(_existingPhoneContactTable)) {
          return new RoomOpenHelper.ValidationResult(false, "phone_contact_table(com.example.kotlindemo.netclan.response_model.PhoneContactTable).\n"
                  + " Expected:\n" + _infoPhoneContactTable + "\n"
                  + " Found:\n" + _existingPhoneContactTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "19599bb92b1beada5492521f3695684e", "cac4711ca79d9e11b3e29fd2323668f3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "profile","profile_table","contacts_table","connection_table","movies_table","hobbies_table","food_table","sports_table","purpose_table","company_table","university_table","origin_table","find_contact_response","buy_sell_chat_table","notes_table","livesIn_table","HomesTown_table","phone_contact_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `profile`");
      _db.execSQL("DELETE FROM `profile_table`");
      _db.execSQL("DELETE FROM `contacts_table`");
      _db.execSQL("DELETE FROM `connection_table`");
      _db.execSQL("DELETE FROM `movies_table`");
      _db.execSQL("DELETE FROM `hobbies_table`");
      _db.execSQL("DELETE FROM `food_table`");
      _db.execSQL("DELETE FROM `sports_table`");
      _db.execSQL("DELETE FROM `purpose_table`");
      _db.execSQL("DELETE FROM `company_table`");
      _db.execSQL("DELETE FROM `university_table`");
      _db.execSQL("DELETE FROM `origin_table`");
      _db.execSQL("DELETE FROM `find_contact_response`");
      _db.execSQL("DELETE FROM `buy_sell_chat_table`");
      _db.execSQL("DELETE FROM `notes_table`");
      _db.execSQL("DELETE FROM `livesIn_table`");
      _db.execSQL("DELETE FROM `HomesTown_table`");
      _db.execSQL("DELETE FROM `phone_contact_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ConnectionsDao.class, ConnectionsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MoviesDao.class, MoviesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SportsDao.class, SportsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PurposeDao.class, PurposeDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UniversityDao.class, UniversityDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OriginDao.class, OriginDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PhoneContactDao.class, PhoneContactDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(NoteListDao.class, NoteListDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LivesInDao.class, LivesInDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HomeTownDao.class, HomeTownDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ConnectionsDao getConnectionDao() {
    if (_connectionsDao != null) {
      return _connectionsDao;
    } else {
      synchronized(this) {
        if(_connectionsDao == null) {
          _connectionsDao = new ConnectionsDao_Impl(this);
        }
        return _connectionsDao;
      }
    }
  }

  @Override
  public MoviesDao getMoviesDao() {
    if (_moviesDao != null) {
      return _moviesDao;
    } else {
      synchronized(this) {
        if(_moviesDao == null) {
          _moviesDao = new MoviesDao_Impl(this);
        }
        return _moviesDao;
      }
    }
  }

  @Override
  public SportsDao getSportsDao() {
    if (_sportsDao != null) {
      return _sportsDao;
    } else {
      synchronized(this) {
        if(_sportsDao == null) {
          _sportsDao = new SportsDao_Impl(this);
        }
        return _sportsDao;
      }
    }
  }

  @Override
  public PurposeDao getPurposeDao() {
    if (_purposeDao != null) {
      return _purposeDao;
    } else {
      synchronized(this) {
        if(_purposeDao == null) {
          _purposeDao = new PurposeDao_Impl(this);
        }
        return _purposeDao;
      }
    }
  }

  @Override
  public UniversityDao getUniversityDao() {
    if (_universityDao != null) {
      return _universityDao;
    } else {
      synchronized(this) {
        if(_universityDao == null) {
          _universityDao = new UniversityDao_Impl(this);
        }
        return _universityDao;
      }
    }
  }

  @Override
  public OriginDao getOriginDao() {
    if (_originDao != null) {
      return _originDao;
    } else {
      synchronized(this) {
        if(_originDao == null) {
          _originDao = new OriginDao_Impl(this);
        }
        return _originDao;
      }
    }
  }

  @Override
  public PhoneContactDao getPhoneContactDao() {
    if (_phoneContactDao != null) {
      return _phoneContactDao;
    } else {
      synchronized(this) {
        if(_phoneContactDao == null) {
          _phoneContactDao = new PhoneContactDao_Impl(this);
        }
        return _phoneContactDao;
      }
    }
  }

  @Override
  public NoteListDao getNotes() {
    if (_noteListDao != null) {
      return _noteListDao;
    } else {
      synchronized(this) {
        if(_noteListDao == null) {
          _noteListDao = new NoteListDao_Impl(this);
        }
        return _noteListDao;
      }
    }
  }

  @Override
  public LivesInDao getLivesInDao() {
    if (_livesInDao != null) {
      return _livesInDao;
    } else {
      synchronized(this) {
        if(_livesInDao == null) {
          _livesInDao = new LivesInDao_Impl(this);
        }
        return _livesInDao;
      }
    }
  }

  @Override
  public HomeTownDao getHomeTownDao() {
    if (_homeTownDao != null) {
      return _homeTownDao;
    } else {
      synchronized(this) {
        if(_homeTownDao == null) {
          _homeTownDao = new HomeTownDao_Impl(this);
        }
        return _homeTownDao;
      }
    }
  }
}
