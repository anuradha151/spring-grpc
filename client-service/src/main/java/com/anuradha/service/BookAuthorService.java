package com.anuradha.service;

import com.anuradha.Author;
import com.anuradha.BookAuthorServiceGrpc;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookAuthorService {

    @GrpcClient("grpc-server")
    BookAuthorServiceGrpc.BookAuthorServiceBlockingStub bookAuthorServiceClient;

    public Map<Descriptors.FieldDescriptor, Object> getAuthor(int id) {
        return bookAuthorServiceClient.getAuthor(
                        Author.newBuilder()
                                .setAuthorId(id)
                                .build())
                .getAllFields();
    }
}
