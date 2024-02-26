package com.anuradha;

import com.anuradha.BookAuthorServiceGrpc.BookAuthorServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc, BookAuthorServiceImplBase {

    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        super.getAuthor(request, responseObserver);
    }
}
