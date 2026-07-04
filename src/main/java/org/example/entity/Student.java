package org.example.entity;

public class Student {


        private String name;
        private long id;
        private String email;

        public Student(String name, int id, String email) {
            this.name = name;
            this.id = id;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }




