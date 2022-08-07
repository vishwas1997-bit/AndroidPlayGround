package com.example.kotlindemo.netclan;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.kotlindemo.netclan.RoomForConnectionList.ConnectionEntity;
import com.example.kotlindemo.netclan.RoomForConnectionList.ConnectionsDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.CompanyEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.ContactEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.FindContactResponse;
import com.example.kotlindemo.netclan.RoomForContactsProfile.FoodEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.HobbiesEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.HomeTownDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.HomeTownEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.LivesInDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.LivesInEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.MoviesDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.MoviesEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.OriginDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.OriginEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PhoneContactDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PurposeDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.PurposeEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.SportsDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.SportsEntity;
import com.example.kotlindemo.netclan.RoomForContactsProfile.UniversityDao;
import com.example.kotlindemo.netclan.RoomForContactsProfile.UniversityEntity;
import com.example.kotlindemo.netclan.local.NoteListDao;
import com.example.kotlindemo.netclan.local.NotesEntity;
import com.example.kotlindemo.netclan.response_model.GetGeneralProfile;
import com.example.kotlindemo.netclan.response_model.PhoneContactTable;
import com.example.kotlindemo.netclan.response_model.type_converters.Converters;

@Database(entities = {GetGeneralProfile.class, ProfileEntity.class, ContactEntity.class,
        ConnectionEntity.class, MoviesEntity.class, HobbiesEntity.class, FoodEntity.class,
        SportsEntity.class, PurposeEntity.class, CompanyEntity.class, UniversityEntity.class,
        OriginEntity.class, FindContactResponse.class, BuySellChatEntity.class
        , NotesEntity.class, LivesInEntity.class, HomeTownEntity.class, PhoneContactTable.class},
        version = 1,exportSchema = false)
@TypeConverters({Converters.class})
public abstract class NetworkingDataBase extends RoomDatabase {

    private static volatile NetworkingDataBase profileDatabase;
    static byte[] passphrase;

    static final Migration MIGRATION_5_6 = new Migration(5,6) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE profile ADD COLUMN visibility_dob_status INTEGER");
            database.execSQL("ALTER TABLE profile ADD COLUMN visibility_profilePic_status INTEGER");
        }
    };

    static final Migration MIGRATION_4_5 = new Migration(4,5) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.
//            database.execSQL("CREATE TABLE IF NOT EXISTS `phone_contact_table` (`fullPhone` STRING,'name' STRING,'photoUri' STRING ,PRIMARY KEY(`fullPhone`))");
        }
    };

    static final Migration MIGRATION_3_4 = new Migration(3, 4) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.

        }
    };
    static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.

        }
    };
    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.

        }
    };
    public static NetworkingDataBase getDatabase(final Context context) {
        if (profileDatabase == null) {
            synchronized (NetworkingDataBase.class) {
                if (profileDatabase == null) {

                    Builder<NetworkingDataBase> builder = Room.databaseBuilder(context.getApplicationContext(),
                            NetworkingDataBase.class, "NetworkingDB")
                            .addMigrations(MIGRATION_1_2,MIGRATION_2_3,MIGRATION_3_4,MIGRATION_4_5,MIGRATION_5_6)
                            .allowMainThreadQueries();
                    profileDatabase = builder.build();
                }
            }
        }
        return profileDatabase;
    }

//    public abstract ProfileDao getProfileDao(); pass

    public abstract ConnectionsDao getConnectionDao();

//    public abstract ContactsProfileDao getContactsProfileDao(); pass

    public abstract MoviesDao getMoviesDao();

//    public abstract HobbiesDao getHobbiesDao(); pass
//
//    public abstract FoodDao getFoodDao(); pass

    public abstract SportsDao getSportsDao();

    public abstract PurposeDao getPurposeDao();

//    public abstract CompanyDao getCompanyDao();  pass

    public abstract UniversityDao getUniversityDao();

    public abstract OriginDao getOriginDao();

//    public abstract ProfileEntityDao getProfileEntityDao();  pass
//
//    public abstract ContactEntityDao getContactEntityDao();  pass

//    public abstract ConnectionEntityDao getConnectionEntityDao();

//    public abstract BuySellChatEntityDao getBuySellChatEntityDao();  pass
//
//    public abstract BuySellChatDao getBuySellChatDao(); pass

    public abstract PhoneContactDao getPhoneContactDao();

    public abstract NoteListDao getNotes();

    public abstract LivesInDao getLivesInDao();

    public abstract HomeTownDao getHomeTownDao();
}
