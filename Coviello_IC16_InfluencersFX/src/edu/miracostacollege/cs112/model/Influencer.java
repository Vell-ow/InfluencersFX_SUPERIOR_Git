package edu.miracostacollege.cs112.model;

import java.util.Objects;

//TODO: Implement the Comparable interface and override the compareTo method
//TODO: "Sort" Influencers by name, then country, then followers, then worth
//TODO: Ensure the Influencer class can be written to a binary file

//TODO: Create child class Celebrity (ensure it can be written to a binary file)
//TODO: Create child class CEO (ensure it can be written to a binary file)

public abstract class Influencer {
    protected String mName;
    protected String mCountry;
    protected long mFollowers;
    protected double mWorth;

    public Influencer(String name, String country, int followers, double worth) {
        mName = name;
        mCountry = country;
        mFollowers = followers;
        mWorth = worth;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public long getFollowers() {
        return mFollowers;
    }

    public void setFollowers(long followers) {
        mFollowers = followers;
    }

    public double getWorth() {
        return mWorth;
    }

    public void setWorth(double worth) {
        mWorth = worth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Influencer that = (Influencer) o;
        return mFollowers == that.mFollowers &&
                Double.compare(that.mWorth, mWorth) == 0 &&
                Objects.equals(mName, that.mName) &&
                Objects.equals(mCountry, that.mCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName, mCountry, mFollowers, mWorth);
    }

}
