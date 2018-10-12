package com.example.domain.interactos.base

import io.reactivex.disposables.Disposable

interface IUseCase<Response, Params> {

    fun execute(params: Params,
               onSuccess: (response: Response) -> Unit,
               onError: (error: Throwable) -> Unit,
               doFinally: () -> Unit = {}
    ): Disposable
}