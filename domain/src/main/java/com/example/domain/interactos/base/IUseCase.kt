package com.example.domain.baseinteractor.interactos

import io.reactivex.disposables.Disposable

interface IUseCase<Response, Params> {

    fun execute(params: Params,
               onSuccess: (response: Response) -> Unit,
               onError: (error: Throwable) -> Unit,
               doFinally: () -> Unit = {}
    ): Disposable
}