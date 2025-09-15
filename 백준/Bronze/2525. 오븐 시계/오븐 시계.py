import sys

hour, min = map(int,sys.stdin.readline().split())
need = int(sys.stdin.readline())

currentTime = hour*60+min #현재 시간 분으로 변환
endTime = currentTime+need #오븐 끝나는 시간 계산

endHour = (int(endTime/60))%24
endMin = int(endTime%60)

print(f'{endHour} {endMin}')
