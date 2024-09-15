# Cafe Management System

A desktop application for small cafes that automates various cafe operations using Java JFrames (frontend) and MySQL (backend) to improve efficiency, customer service, and order processing.

## Prepared by
- Harjandar Kumar Tejwani


## Table of Contents
1. [Introduction](#introduction)
    - [Purpose](#purpose)
    - [Objectives](#objectives)
    - [Problem Statement](#problem-statement)
    - [Scope and Domain](#scope-and-domain)
2. [Entity-Relationship Diagram (ERD)](#entity-relationship-diagram-erd)
    - [ERD Overview](#erd-overview)
    - [ERD Diagram](#erd-diagram)
3. [GUI](#gui)
    - [Overview of GUI Components](#overview-of-gui-components)
    - [Screenshots](#screenshots)
    - [Functionalities Provided by GUI](#functionalities-provided-by-gui)
    - [User Interaction Flows](#user-interaction-flows)
4. [Database Schema](#database-schema)

## Introduction

### Purpose
The goal of this system is to automate cafe operations, streamline order processing, and improve customer service. It also ensures data security while facilitating smooth and efficient order management.

### Objectives
- Streamline the order management process.
- Enhance customer experience.
- Ensure secure data handling and efficient sales tracking.

### Problem Statement
Manual processes in cafes often lead to delays in order fulfillment, inaccurate inventory tracking, limited customer engagement, and issues with data security and compliance. This system addresses these problems by automating key processes.

### Scope and Domain
The Cafe Management System focuses on:
- **Order Management**
- **Customer Engagement**
- **Sales Tracking**

This aims to enhance the overall efficiency and customer satisfaction in small cafes.

## Entity-Relationship Diagram (ERD)

### ERD Overview
The ERD provides a visual representation of the database schema, showcasing the relationships between entities such as users, categories, products, and bills. It serves as a blueprint for designing and understanding the system’s database structure.

### ERD Diagram
*An ERD diagram showing the entities and relationships will be added here.*

## GUI

### Overview of GUI Components
The GUI is developed using Java JFrames in NetBeans, utilizing drag-and-drop features to create a user-friendly interface. It includes various components like buttons, text fields, labels, and tables for functionalities such as order management and sales tracking.

### Functionalities Provided by GUI
The GUI allows administrators to:
- Create user accounts.
- Manage orders efficiently.
- Navigate through menus and perform actions such as adding items to orders or generating sales reports.

### User Interaction Flows
The user interaction flow outlines how users move through different screens and interact with various elements to perform tasks such as:
- Creating accounts.
- Placing orders.
- Viewing sales data.

## Database Schema

### User Table
```sql
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200),
    email VARCHAR(200) UNIQUE,
    mobileNumber VARCHAR(11),
    address VARCHAR(200),
    password VARCHAR(200),
    securityQuestion VARCHAR(200),
    answer VARCHAR(200)
);
```

### Category Table
```sql
CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200)
);
```

### Product Table
```sql
CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200),
    category_id INT,
    price VARCHAR(200),
    FOREIGN KEY (category_id) REFERENCES category(id)
);
```

### Bill Table
```sql
CREATE TABLE bill (
    id INT PRIMARY KEY,
    name VARCHAR(200),
    mobileNumber VARCHAR(200),
    email VARCHAR(200),
    date VARCHAR(200),
    total VARCHAR(200),
    createdBy INT,
    FOREIGN KEY (createdBy) REFERENCES user(id)
);
