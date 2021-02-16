package org.pasudo123.commitsearcher.exception

class EntityNotFoundException(var code: ErrorCode, message: String) : RuntimeException(message)