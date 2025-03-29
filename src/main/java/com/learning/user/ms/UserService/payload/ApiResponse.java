package com.learning.user.ms.UserService.payload;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;


    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ApiResponse{" +
                "message='" + message + '\'' +
                ", success=" + success +
                ", status=" + status +
                '}';
    }
}
