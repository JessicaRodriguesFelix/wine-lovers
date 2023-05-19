# Crush Club - Wine Lovers V.1
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0-blue.svg?cacheSeconds=2592000" />
</p>
A Web Application for Wine Lovers that allows users to add reviews to help bring together a community of wine enthusiasts and help them share their experience and recommendations.

Crush Club is a web application built with Spring Boot 3.0.5 using Maven and Java 17, and uses MongoDB as its database.

The main objective of the initial MVP was to establish a backend framework that enables users to perform essential database operations, such as retrieving all entries, fetching a specific entry, and adding new entries.

## More information about Tech Stack
Java Spring Boot is an open-source tool that makes it easier to use Java-based frameworks to create microservices and web apps. 

MongoDB is a cross-platform, document oriented database that provides, high performance, high availability, and easy scalability. 
It is a non-relational document database that provides support for JSON-like storage and works on concept of collection and document. 

## JSON Document for MongoDB
The JSON schema below represents a data schema for the collection of "wines" in the MongoDB that represents a collection of wine objects for storing and querying information about different wines and their associated wineries, regions, and images, as well as for tracking reviews and other related information:

* winery: A string representing the name of the winery.
* wine: A string representing the name of the wine.
* location: A string representing the location of the winery, with a format of "country\n·\nregion".
* image: A string representing the URL of an image of the wine.
* imdbId: A string identifier for the wine object.
* reviewIds: An array of numerical identifiers representing the IDs of reviews associated with the wine object.

![image](https://github.com/JessicaRodriguesFelix/wine-lovers/assets/40796998/60bf6fbc-ad5f-4c56-9c87-84da70cd573f)

## Wines Endpoint:

The wines endpoint is available in the API and can be used to retrieve information about wines stored in the MongoDB database. Specifically, the endpoint supports two operations:

**GET /wines**: Retrieves a list of all the wines stored in the database.
**GET /wines/{id}**: Retrieves information about a specific wine stored in the database, identified by its imdbId.

## Reviews Endpoint:
The reviews endpoint is available in the API and can be used to save user comments regarding specific entries in the database. Specifically, the endpoint supports one operation:

**POST /reviews**: Saves a new review to the database for the wine with the given imdbId.

## CI/CD Pipeline and Deployment

In this repository, I am using GitHub Actions to implement a continuous integration and continuous delivery (CI/CD) pipeline for my application. 

GitHub Actions provides an easy-to-use and powerful platform for automating build, test, and deployment processes directly from my repository, with customizable workflows that can be triggered on events like code pushes, pull requests, or scheduled intervals.

To deploy my application, I am using Railways, a modern platform for hosting and managing web applications in the cloud. 

Together, GitHub Actions and Railways enable me to streamline my development and deployment process, reduce manual errors, and ensure consistent and reliable performance of my application.

### Author
👤 Jessica Rodrigues-Dlouhy

