package com.vetias.java.workshop.temperaturedata.beans;

public class Location {
   
        private String name;
        private double latitude;
        private double longitude;
        private String description;
        private String country;
        private String city;
        private String address;
        private long postalcode;
        public void setName(String aName)
        {
            name=aName;
        }
        public String getName()
        {
            return name;
        }
        public void setLatitude(double aLatitude)
        {
            latitude=aLatitude;
        }
        public double getLatitude()
        {
            return latitude;
        }
        public void setLongitude(double aLongitude)
        {
            longitude=aLongitude;
        }
        public double getLongitude()
        {
            return longitude;
        }
         public void setDescription(String aDescription)
        {
            description=aDescription;
        }
        public String getDescription()
        {
            return description;
        }
         public void setCountry(String aCountry)
        {
            country=aCountry;
        }
        public String getCountry()
        {
            return country;
        }
         public void setCity(String aCity)
        {
            city=aCity;
        }
        public String getCity()
        {
            return city;
        }
         public void setAddress(String aAddress)
        {
            address=aAddress;
        }
        public String getAddress()
        {
            return address;
        }
         public void setPostalcode(long aPostalcode)
        {
            postalcode= aPostalcode;
        }
        public long getPostalcode()
        {
            return postalcode;
        }
        @Override
        public String toString(){
            return "location{name:"+ name +
                ",Latitude:"+latitude+
                ",Longitude:"+longitude+
                ",Description:"+description+
                ",Country:"+country+
                ",City:"+city+
                ",Address:"+address+
                ",Postalcode:"+postalcode+
                "}";
            }
}        



