# Changelog

All notable changes to this project will be documented in this file

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)

Dates in this file will have the following format: MM/DD/YYYY

1) Branch "main" was created with repository
2) I will work with branching methodology. Each branch will be one feature (one ticket in JIRA)
3) When one feature is finished, branch will be merged with "main" branch as you can see in [github](https://github.com/aorizzuto/Inditex)
4) Each branch will have multiple commits explaining what it does each commit
5) Each branch will have a pull request (merge request) that was merged to branch main
6) The project needs to have three main branches: "main: DEV", "staging:QA" and "prod". In this challenge I only created main branch

### NOTE:
- We could use Project Reactor to this project but this depends on how many requests by second in this API will have.
- Using Project Reactor allows parallel thread execution. We need to use Mono/Flex and subscribe Monos to perform the cycle.

## [0.2.0] - 03/20/2022 - Branch: feature/MVC-development
## Added
- Controller creation using requestParam and requestBody to get group information and user that send the message
- Endpoint creation
- Constructor dependency injection
- DTO
  - contactDTO to get group users information
  - groupRequestDTO to get request from Constructor
  - groupResponseDTO to response HttpStatus. In this project, I am sending the message through another API but we can return contact list as a response
- Repository creation to handle database queries (JPA) CRUD
  - Model of contacts (name, id, phonenumber, etc)
  - interface and query to bring contacts for groupId
- Service creation. Validation request and process request methods
- Validation package. 
  - GroupValidation to handle all validations for groups
  - IdValidation to handle all id validations
    - Needs to be positive
    - Needs to not be null
    - etc
- build.gradle modification. Adding LOMBOK to handle getter/setter/constructors and builders
- 

## [0.1.0] - 03/20/2022 - Branch: feature/structure
## Added
- Project structure
- README with specifications
- CHANGELOG to explain step by step
