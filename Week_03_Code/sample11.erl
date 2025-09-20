% Lecture: ProceduresPartIV
% Summary: In this program we explore writing procedures through Erlang.

-module(sample).
-export([main/1]).

main(_) ->
    % io:format("~p~n", [add(1, 2)]).
    % io:format("~p~n", [max2(1, 2)]).
    % io:format("~p~n", [max2(2, 1)]).
    io:format("~p~n", [max([1, 2, 4, 3, 0])]).

add(Op1, Op2) -> 
    Op1 + Op2.

max2(A, B) when A > B -> A;
max2(_, B) -> B.

max([H | []]) -> H;
max([H | T]) ->
    max2(H, max(T)).
