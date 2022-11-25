## :hospital: Medical Care Management System

Medical Care is a management system of patients and doctors of a given clinic. Basically there are three profiles types: Admin, Patients and Doctors. The Admin will be able to add the doctos (so doctors won't be able to registres), see list of patients, see list of doctors, remove doctors. The Patients will be able to perform tasks such as registering, login, viewing their profile and seeing available doctor. And the Doctos will have acess to similar functions such as login, viewing their profile, and seeing a list of patients.

---

## How to make it work? 🧑🏼‍💻

The project is encapsulated in docker containers. To run locally, one just needs to clone this repository:

`$ git clone https://github.com/becacoli/poo-project.git`

and build the images using:

`$ docker build -t poo .`

having created the images, run the servers using:

`$ docker run -it -p 8080:8080 --name poo-container poo`

---

## Main Features

**Class Patients**

- _Create an account_
- Login
- View profile
- View doctor list
- Make an medical consultation
- _Payment_
- Write feedbacks

**Class Doctors:**

- Login
- View profile
- View patients list
- View feedbacks

**Class Admin:**

- Make an medical consultation
- View doctors and patients list
- Payment
- Add and remove doctos

### Technologies

---

- Java
