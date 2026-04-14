package com.gla.Generics.JavaCollection;
import java.time.LocalDate;
import java.util.Objects;
public class PolicyClass {

    class Policy {
        int policyNumber;
        String name;
        LocalDate expiryDate;
        String coverageType;
        double premium;

        public Policy(int policyNumber, String name, LocalDate expiryDate,
                      String coverageType, double premium) {
            this.policyNumber = policyNumber;
            this.name = name;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premium = premium;
        }

        // equals & hashCode → uniqueness by policyNumber
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Policy)) return false;
            Policy p = (Policy) o;
            return policyNumber == p.policyNumber;
        }

        @Override
        public int hashCode() {
            return Objects.hash(policyNumber);
        }

        @Override
        public String toString() {
            return policyNumber + " | " + name + " | " + expiryDate + " | " + coverageType;
        }
    }
}
