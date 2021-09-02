package com.yash.hibernate2;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "account", catalog = "test")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="account")
public class Account implements java.io.Serializable
{
 
        /**
         * 
         */
        private static final long serialVersionUID = -2876316197910860162L;
 
        private long accountNumber;
 
        private Person person;
 
        private String accountType;
 
        public Account()
        {
        }
 
        public Account(long accountNumber)
        {
                this.accountNumber = accountNumber;
        }
        public Account(long accountNumber, Person person, String accountType)
        {
                this.accountNumber = accountNumber;
                this.person = person;
                this.accountType = accountType;
        }
 
        @Id
 
        @Column(name = "Account_Number", unique = true, nullable = false)
        public long getAccountNumber()
        {
                return this.accountNumber;
        }
 
        public void setAccountNumber(long accountNumber)
        {
                this.accountNumber = accountNumber;
        }
 
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "Person_id")
        public Person getPerson()
        {
                return this.person;
        }
 
        public void setPerson(Person person)
        {
                this.person = person;
        }
 
        @Column(name = "Account_Type", length = 45)
        public String getAccountType()
        {
                return this.accountType;
        }
 
        public void setAccountType(String accountType)
        {
                this.accountType = accountType;
        }
 
        @Override
        public String toString()
        {
                return "Account [accountNumber=" + accountNumber + ", person=" + person + ", accountType=" + accountType + "]";
        }       
}