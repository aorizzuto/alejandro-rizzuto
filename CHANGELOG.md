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

## [0.1.0] - 03/20/2022 - Branch: feature/structure
## Added
