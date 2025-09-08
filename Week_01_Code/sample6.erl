% Lecture: FunctionalStylePartIV
% Summary: In this program we explore mutability vs immutabilty with Erlang.

-module(sample).
-export([main/1]).

main(_) ->
    Values = [1, 2, 3, 4, 5, 6],
    Doubled = lists:map(fun(E) ->  E * 2 end, Values),
    io:format("~p", [Doubled]).

    % X = 1,
    % io:format("~p~n", [x]),
    % Y = 4,
    % io:format("~p~n", [Y]),
    % Y = X + 3,
    % io:format("~p~n", [Y]).

    % {Water, "vapor"} = {"coldwater", "vapor"},
    % io:format("~p", [Water]),
    % {Water, Steam} = {"coldwater", "steam"},
    % io:format("~p", [Steam]).