package com.yash.hibernate2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "person", catalog = "test")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="person")
public class Person 
{
	private Long pid;
	 
    private Double personAge;

    private String personName;

    private Set accounts = new HashSet(0);

    public Person()
    {
    }

    public Person(Double personAge, String personName, Set accounts)
    {
            this.personAge = personAge;
            this.personName = personName;
            this.accounts = accounts;
    }

    @Id
    @Column(name = "pId", unique = true, nullable = false)
    public Long getPid()
    {
            return this.pid;
    }

    public void setPid(Long pid)
    {
            this.pid = pid;
    }

    @Column(name = "personAge")
    public Double getPersonAge()
    {
            return this.personAge;
    }

    public void setPersonAge(Double personAge)
    {
            this.personAge = personAge;
    }

    @Column(name = "personName")
    public String getPersonName()
    {
            return this.personName;
    }

    public void setPersonName(String personName)
    {
            this.personName = personName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    public Set getAccounts()
    {
            return this.accounts;
    }

    public void setAccounts(Set accounts)
    {
            this.accounts = accounts;
    }

    @Override
    public String toString()
    {
            return "Person [pid=" + pid + ", personAge=" + personAge + ", personName=" + personName + "]";
    }
}

