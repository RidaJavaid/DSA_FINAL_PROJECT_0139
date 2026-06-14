# DSA_FINAL_PROJECT_0139

# Fake News Detection Analyzer

## Project Overview

Fake News Detection Analyzer is a Java-based console application that helps users analyze news articles and identify whether they are likely real, suspicious, or fake. The project uses various Data Structures from Java Collections Framework to efficiently store, process, and manage news data.


## Features

* Analyze news articles based on suspicious keywords.
* Detect potentially fake news using a scoring mechanism.
* Maintain a list of trusted news sources.
* Display suspicious keywords in sorted order.
* Store analyzed news records.
* Search news by source.
* Delete news records.
* View analysis history.
* Generate project statistics.


##  Data Structures Used

| Data Structure | Purpose                                     |
| -------------- | ------------------------------------------- |
| HashMap        | Stores suspicious keywords and their scores |
| HashSet        | Stores trusted news sources                 |
| TreeSet        | Displays keywords in sorted order           |
| LinkedList     | Stores analyzed news records                |
| ArrayList      | Maintains analysis history                  |


## How It Works

### Step 1: Enter News Information

The user provides:

* News Source
* News Article

### Step 2: Fake Score Calculation

The system scans the article for suspicious keywords such as:

* fake
* miracle
* secret
* viral
* conspiracy
* unbelievable
* shocking

Each keyword contributes a predefined score.

### Step 3: Source Verification

If the news source belongs to trusted sources such as:

* BBC
* CNN
* Reuters
* Al Jazeera
* Dawn

The score is reduced to improve reliability.

### Step 4: Classification

| Score Range | Result           |
| ----------- | ---------------- |
| 0 - 3       | Likely Real News |
| 4 - 8       | Suspicious News  |
| Above 8     | Likely Fake News |



## Menu Options

1. Analyze News
2. Display Keywords (TreeSet)
3. View All News (LinkedList)
4. Search News
5. Delete News
6. View History (ArrayList)
7. Statistics
8. Exit



##  Technologies Used

* Java
* Java Collections Framework
* Object-Oriented Programming (OOP)
* Data Structures & Algorithms (DSA)



## Project Structure

```text
FakeNewsAnalyzer
│
├── News Class
│   ├── source
│   ├── article
│   ├── score
│   └── result
│
└── FakeNewsAnalyzer Class
    ├── initializeData()
    ├── calculateScore()
    ├── classifyNews()
    ├── analyzeNews()
    ├── displayKeywords()
    ├── viewAllNews()
    ├── searchNews()
    ├── deleteNews()
    ├── viewHistory()
    ├── statistics()
    └── main()
```


## Running the Project

### Compile

```bash
javac FakeNewsAnalyzer.java
```

### Run

```bash
java FakeNewsAnalyzer
```



## Sample Output

```text
ANALYSIS REPORT

Source : Unknown News
Fake Score : 10
Result : LIKELY FAKE NEWS
```


## Learning Outcomes

This project demonstrates practical implementation of:

* HashMap
* HashSet
* TreeSet
* LinkedList
* ArrayList
* Searching
* Data Management
* Object-Oriented Programming
* Console-Based Application Development


## Author

**Rida Javaid**
Registration No: L1F24BSSE0139
BS Software Engineering
Data Structures (Lab)
