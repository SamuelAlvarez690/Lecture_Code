% Lecture: TypingPartI
% Summary: In this program we explore how Lists a play special role in functional languages.

-module(sample).
-export([main/1]).

main(_) ->
    process([1, 2, 3, 4, 5]).

% process(L) ->
%     io:format("~p~n", [L]).

% process([H|T]) ->
%     io:format("~p~n", [H]),
%     io:format("~p~n", [T]).

process([H|[]]) ->
    io:format("~p", [H]);
process([H|T]) ->
    io:format("~p-", [H]),
    process(T).