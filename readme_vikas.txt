

addStudent : 

http://localhost:9000/addStudent

Request : {
 "classRoomId":"2",
 "studentName":"vikas",
 "fatherName":"ram"
}


{
    "responseCode": "200",
    "status": "Success",
    "errorCode": null,
    "errorMessage": null,
    "responseObj": {
        "studentId": 11,
        "classRoomSeqId": 9,
        "studentName": "vikas",
        "fatherName": "ram",
        "classRoomId": {
            "classRoomId": 2,
            "classRoomName": "CLASS_2",
            "capacity": 60,
            "totalDivisions": 5
        },
        "division": "A"
    }
}



getAllStudent : // for particular class

http://localhost:9000/getAllStudent 


Request : 

{
 "classRoomId":"2",

}


Response : 

{
    "responseCode": "200",
    "status": "Success",
    "errorCode": null,
    "errorMessage": null,
    "responseObj": [
        {
            "studentId": 3,
            "classRoomSeqId": 1,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 4,
            "classRoomSeqId": 2,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 5,
            "classRoomSeqId": 3,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 6,
            "classRoomSeqId": 4,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 7,
            "classRoomSeqId": 5,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 8,
            "classRoomSeqId": 6,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 9,
            "classRoomSeqId": 7,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 10,
            "classRoomSeqId": 8,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        },
        {
            "studentId": 11,
            "classRoomSeqId": 9,
            "studentName": "vikas",
            "fatherName": "ram",
            "classRoomId": {
                "classRoomId": 2,
                "classRoomName": "CLASS_2",
                "capacity": 60,
                "totalDivisions": 5
            },
            "division": "A"
        }
    ]
}

